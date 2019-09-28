package com.inmarsat.stm.urs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.BrokerInfo;
import org.apache.activemq.transport.TransportListener;
import org.codehaus.jackson.JsonParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.inmarsat.stm.urs.DBUtils.TimeUnits;
import com.inmarsat.stm.urs.beans.SacMapBean;
import com.inmarsat.stm.urs.beans.UTInfoBean;

public class GPSRecordConsumerThread implements Runnable, ExceptionListener {

	final static Logger logger = LoggerFactory.getLogger(GPSRecordConsumerThread.class);

	private String url = ActiveMQConnection.DEFAULT_BROKER_URL;
	private String subject = "TESTQUEUE";
	private String username = "";
	private String passwd = "";
	Long timeout = new Long(1000);
	private String spburl =  null; 
	private String spbusername = null; 
	private String spbpasswd = null; 
	private String spburl2 = null; 
	private String spbusername2 = null; 
	private String spbpasswd2 = null; 
	private Integer targetType = STMGlobals.accessNetBGAN;

	public GPSRecordConsumerThread(String args[], String url_in, String subject_in, String username_in, String passwd_in, Long receiverTimeout_in, String spbusername_in, String spbpasswd_in, String spburl_in, String spbusername2_in, String spbpasswd2_in, String spburl2_in, Integer targetType_in ) {
		this.url = url_in;
		this.subject = subject_in;
		this.username = username_in;
		this.passwd = passwd_in;
		timeout = receiverTimeout_in;
		this.spburl = spburl_in;
		this.spbusername = spbusername_in;
		this.spbpasswd = spbpasswd_in;
		this.spburl2 = spburl2_in;
		this.spbusername2 = spbusername2_in;
		this.spbpasswd2 = spbpasswd2_in;
		this.targetType = targetType_in;

		// STMGlobals.URS_consume_only = false; // Option to reset from URS consume only state

		String propsFilePath = "stm.properties";


		Properties prop = new Properties();
		InputStream input = null;

		try {

			if (args.length == 1) { // assume it's a properties file or batch size and
				// nothing else
				try {
					GPSRecordConsumer.BGAN_batch_size = Integer.parseInt(args[0]);
				} catch(NumberFormatException e) {
					//not an int thus a properties file
					propsFilePath = args[0];
				}


			}

			if (args.length > 1) { // assume all settings are from args

				if ((url == null || url == "") && args.length > 0) {
					url = args[0];
				}

				// no default value - must be set.
				if ((subject == null || url == "") && args.length > 1) {
					subject = args[1];
				}

				if ((username == null || username == "") && args.length > 2) {
					username = args[2];
				}

				if ((passwd == null || passwd == "") && args.length > 3) {
					passwd = args[3];
				}
			} else {

				File propsFile = new File(propsFilePath);
				if (propsFile.exists()) {
					input = new FileInputStream(propsFilePath);
					prop.load(input);
					url = prop.getProperty("brokerURL");
					if (url == null || url.equalsIgnoreCase("default")) {
						url = ActiveMQConnection.DEFAULT_BROKER_URL;
					}
					subject = prop.getProperty("subject");
					if (subject == null)
						subject = "TESTQUEUE";
					username = prop.getProperty("username");
					if (username == null)
						username = "";
					passwd = prop.getProperty("passwd");
					if (passwd == null)
						passwd = "";

					String str_BGAN_batch_size = prop.getProperty("BGAN_batch");
					if (str_BGAN_batch_size != null) {
						try {
							GPSRecordConsumer.BGAN_batch_size = Integer.parseInt(str_BGAN_batch_size);
						} catch(NumberFormatException e) {
							//not an int thus set default
							GPSRecordConsumer.BGAN_batch_size = GPSRecordConsumer.batch_size_default;
						}
					}

					String str_GX_batch_size = prop.getProperty("GX_batch");
					if (str_GX_batch_size != null) {
						try {
							GPSRecordConsumer.GX_batch_size = Integer.parseInt(str_GX_batch_size);
						} catch(NumberFormatException e) {
							//not an int thus set default
							GPSRecordConsumer.GX_batch_size = GPSRecordConsumer.batch_size_default;
						}
					}

					String str_inactivityMonitor = prop.getProperty("inactivityMonitor");
					if (str_inactivityMonitor != null) {
						try {
							STMGlobals.URS_inactivity_timeout= Integer.parseInt(str_inactivityMonitor);
						} catch(NumberFormatException e) {
							//not an int thus set default
							logger.error("Invalid value for URS inactivity monitor. Using default of 60secs.");
						}
					} else {
						logger.error("Failed to find settings value for URS inactivity monitor. Using default of 60secs.");
					}

					String str_recoveryMonitor = prop.getProperty("recoveryMonitor");
					if (str_recoveryMonitor != null) {
						try {
							STMGlobals.SPB_recover_monitor= Integer.parseInt(str_recoveryMonitor);
						} catch(NumberFormatException e) {
							//not an int thus set default
							logger.error("Invalid value for SPB recovery monitor. Using default of {}secs.", STMGlobals.SPB_recover_monitor);
						}
					} else {
						logger.error("Failed to find settings value for SPB recovery monitor. Using default of {}secs.", STMGlobals.SPB_recover_monitor);
					}

					String rto = prop.getProperty("receiverTimeOut");
					if (rto != null)
						GPSRecordConsumer.receiverTimeout = Long.parseLong(rto);
					String rml = prop.getProperty("receiverMonitorLoop");
					if (rml != null)
						GPSRecordConsumer.receiverMonitorLoop = Long.parseLong(rml);

					String dbconn = prop.getProperty("dbconnectionURL");
					if(dbconn != null)
						STMGlobals.connectionURL=dbconn;
					String dbuser = prop.getProperty("dbuser");
					if(dbuser != null)
						STMGlobals.user=dbuser;

					String dbpass = prop.getProperty("dbpasswd");
					if(dbpass != null)
						STMGlobals.passwd=dbpass;

					String dbConnectionInitialPoolSize = prop.getProperty("dbConnectionInitialPoolSize");
					if(dbConnectionInitialPoolSize != null)
						STMGlobals.DBConnectionInitialPoolSize=Integer.parseInt(dbConnectionInitialPoolSize);
					String dbConnectionMaxPoolSize = prop.getProperty("dbConnectionMaxPoolSize");
					if(dbConnectionMaxPoolSize != null)
						STMGlobals.DBConnectionMaxPoolSize=Integer.parseInt(dbConnectionMaxPoolSize);

					String tz = prop.getProperty("TimeZone");
					if(tz != null)
						STMGlobals.TimeZone=tz;

					String tu = prop.getProperty("GPSMessageTimeUnit");
					if(tu != null) {
						DBUtils.TimeUnits timeUnit = DBUtils.TimeUnits.getTimeUnit(tu);
						if(timeUnit.equals(DBUtils.TimeUnits.UNKNOWN)) {
							throw new IOException("Unkown time unit - check properties file.");
						}
						else {
							STMGlobals.gpsMessageTimeUnit = timeUnit;
						}
					}

					String frd = prop.getProperty("frexitProcessDelta");
					if(frd != null)
						STMGlobals.frexitProcessDelta=new Long(frd);

					spburl = prop.getProperty("spburl_gx");
					if(spburl != null)
						STMGlobals.spburl_gx_primary=spburl;

					String spbuser = prop.getProperty("spbuser_gx");
					if(spbuser != null)
						STMGlobals.spbuser_gx_primary=spbuser;

					String spbpass = prop.getProperty("spbpasswd_gx");
					if(spbpass != null)
						STMGlobals.spbpasswd_gx_primary=spbpass;

					spburl2 = prop.getProperty("spburl_bgan");
					if(spburl2 != null)
						STMGlobals.spburl_bgan_primary=spburl2;

					String spbuser2 = prop.getProperty("spbuser_bgan");
					if(spbuser2 != null)
						STMGlobals.spbuser_bgan_primary=spbuser2;

					String spbpass2 = prop.getProperty("spbpasswd_bgan");
					if(spbpass2 != null)
						STMGlobals.spbpasswd_bgan_primary=spbpass2;

					String spburl3 = prop.getProperty("spburl_gx_sec");
					if(spburl3 != null)
						STMGlobals.spburl_gx_secondary=spburl3;

					String spbuser3 = prop.getProperty("spbuser_gx_sec");
					if(spbuser3 != null)
						STMGlobals.spbuser_gx_secondary=spbuser3;

					String spbpass3 = prop.getProperty("spbpasswd_gx_sec");
					if(spbpass3 != null)
						STMGlobals.spbpasswd_gx_secondary=spbpass3;

					String spburl4 = prop.getProperty("spburl_bgan_sec");
					if(spburl4 != null)
						STMGlobals.spburl_bgan_secondary=spburl4;

					String spbuser4 = prop.getProperty("spbuser_bgan_sec");
					if(spbuser4 != null)
						STMGlobals.spbuser_bgan_secondary=spbuser4;

					String spbpass4 = prop.getProperty("spbpasswd_bgan_sec");
					if(spbpass4 != null)
						STMGlobals.spbpasswd_bgan_secondary=spbpass4;


					String tgt = prop.getProperty("targetType");
					if (tgt != null)
						STMGlobals.targetType=Integer.parseInt(tgt);

					String ora = prop.getProperty("oracle_enabled");
					if (ora != null)
						STMGlobals.oracle_enabled=Boolean.parseBoolean(ora);

					String soap_debug = prop.getProperty("SOAP_debug");
					if (soap_debug != null)
						STMGlobals.SOAP_debug=Boolean.parseBoolean(soap_debug);

				}
			}

			logger.info("Loaded Settings - user: {}; passwd: {}; subject: {}; url: {}",
					new Object[] { username, passwd, subject, url });

			logger.info("Loaded Settings - Primary GX SPB user: {}; spb passwd: {}; spb url: {}",
					new Object[] { STMGlobals.spbuser_gx_primary, STMGlobals.spbpasswd_gx_primary, STMGlobals.spburl_gx_primary });
			logger.info("Loaded Settings - Secondary GX SPB user: {}; spb passwd: {}; spb url: {}",
					new Object[] { STMGlobals.spbuser_gx_secondary, STMGlobals.spbpasswd_gx_secondary, STMGlobals.spburl_gx_secondary });
			logger.info("Loaded Settings - Primary BGAN SPB user: {}; spb passwd: {}; spb url: {}",
					new Object[] { STMGlobals.spbuser_bgan_secondary, STMGlobals.spbpasswd_bgan_primary, STMGlobals.spburl_bgan_primary });
			logger.info("Loaded Settings - Secondary BGAN SPB user: {}; spb passwd: {}; spb url: {}",
					new Object[] { STMGlobals.spbuser_bgan_secondary, STMGlobals.spbpasswd_bgan_secondary, STMGlobals.spburl_bgan_secondary });
			logger.info("Current Settings - BGAN Batch: " + GPSRecordConsumer.BGAN_batch_size + " GX Batch: " + GPSRecordConsumer.GX_batch_size);
		} catch (IOException ex) {

			logger.error("IO Error on properties file", ex);
			return;
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					logger.error("Couldn't close properties file.", e);
					return;
				}
			}
		}
		
	}

	public void run() {

		long inactivityMonitor = 0;
		String messageString = "";
		Connection connection = null;
		Session session = null;
		MessageConsumer consumer = null;
		try {

			ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
			connection = connectionFactory.createConnection(username, passwd);
			if (connection != null)
				logger.debug("Established connection to url:  {}", url);
			connection.start();
			connection.setExceptionListener(this);
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			if (session != null)
				logger.debug("Created session");
			Destination destination = session.createQueue(subject);
			if (destination != null)
				logger.debug("Created destination for subject: {}", subject);
			consumer = session.createConsumer(destination);
			if (consumer != null)
				logger.debug("Created consumer.");
            enableConnectionListener((ActiveMQConnection) connection);

			boolean freActDone = false;
			while (!Thread.currentThread().isInterrupted()) {
				Message message = consumer.receive(timeout);
				if (message != null) {
					freActDone = false;
					Long messageTime = process(message, messageString);
					Long now = STMUtils.getCurrentTime();  
					// Scale timestamp to seconds for new URS feed -- set property GPSMessageTimeUnit = ms
					if (STMGlobals.gpsMessageTimeUnit == TimeUnits.SECONDS) { 
						now = now / 1000; 
					} 				 
					
					logger.debug("now({}) -- messageTime({})", new Object[] { now.toString(), messageTime.toString() });
					if(messageTime <= 0)
					{
						logger.debug("Received negative time error signal, ignoring message.");
					}
					else if (now - messageTime < STMGlobals.frexitProcessDelta) {
						logger.debug("Processing FRExit_Actions");
						if(processFRExitActions())
							freActDone = true;
					}
					inactivityMonitor = 0;
				} else {
					logger.debug("Waiting for message - on {}ms loop.", timeout.toString());
					if (!freActDone) {
						logger.debug("Processing FRExit_Actions");
						if(processFRExitActions())
							freActDone = true;
					}
					inactivityMonitor += timeout;
					logger.warn("No messages received for  {}ms.", inactivityMonitor);
					if (inactivityMonitor >= STMGlobals.URS_inactivity_timeout) {
						STMGlobals.URS_reset_connection = true;
						logger.warn("Preparing to reset consumer thread. Trying to close JMS connection...");
						if (consumer != null) consumer.close();
						if (session != null) session.close();
						if (connection != null) connection.close();
						logger.warn("JMS connection closed.");
						logger.warn("Creating new JMS connection to URS.");
						return;
					}

				}
			}
		} catch (JMSException jms) {
			logger.error("JMS Error: {}", jms.getErrorCode());
			logger.error("JMS Cause: {}", jms.getCause());
			logger.error("Stack Trace: {}", STMUtils.getStackString(jms.getStackTrace()));

		} catch (Exception exception) {
			logger.error("Error: ", exception);
			logger.error("Stack Trace: {}", STMUtils.getStackString(exception.getStackTrace()));
		} finally {
			try {
				logger.debug("Trying to close JMS connection...");
				if (consumer != null)
					consumer.close();
				if (session != null)
					session.close();
				if (connection != null)
					connection.close();
				logger.debug("JMS connection closed.");
			} catch (JMSException jmsEx) {
				logger.error("Couldn't close JMS connection: {}", STMUtils.getStackString(jmsEx.getStackTrace()));
			}
		}
	}

    private void printBrokerInfo(ActiveMQConnection connection) {
        BrokerInfo binfo = null;
        String conninfo = null;

        try {
            if ((binfo = ((ActiveMQConnection) connection).getBrokerInfo()) != null) {
                conninfo = "Connected to : " + binfo.getBrokerName() +
                        ", Connection Id : " + binfo.getConnectionId() +
                        ", Client Id : " + ((ActiveMQConnection) connection).getClientID() +
                        ", TrasportChannel :" + ((ActiveMQConnection) connection).getTransportChannel().toString();
            } else {
                conninfo = "Connection information is not available.";
            }
            logger.warn(conninfo);
        } catch (JMSException jms) {
            logger.error("JMS Error: {}", jms.getErrorCode());
            logger.error("Stack Trace: {}", STMUtils.getStackString(jms.getStackTrace()));
        }
    }

	protected void printBrokerDisconnectInfo(ActiveMQConnection connection) {
		{
			BrokerInfo binfo = null;
			String conninfo = null;

			try {
				if ((binfo = ((ActiveMQConnection) connection).getBrokerInfo()) != null) {
					conninfo = "Disconnected from : " + binfo.getBrokerName() +
							", Connection Id : " + binfo.getConnectionId() +
							", Client Id : " + ((ActiveMQConnection) connection).getClientID() +
							", TrasportChannel :" + ((ActiveMQConnection) connection).getTransportChannel().toString();
				} else {
					conninfo = "Connection information is not available.";
				}
				logger.warn(conninfo);
			} catch (JMSException jms) {
				logger.error("JMS Error: {}", jms.getErrorCode());
				logger.error("Stack Trace: {}", STMUtils.getStackString(jms.getStackTrace()));

			}
		}
	}

    private void enableConnectionListener (final ActiveMQConnection connection)
    {
        ((ActiveMQConnection) connection).addTransportListener(new TransportListener()
        {
            public void onCommand( Object command)
            {
            }
            public void onException( IOException error)
            {
            }
            public void transportInterupted()
            {
                printBrokerDisconnectInfo(connection);
            }
            public void transportResumed()
            {
                printBrokerInfo(connection);
            }
        });
    };

	private boolean processFRExitActions() {
		
		return true;
	}

	private Long process(Message message, String messageString) throws JMSException {

		if (message instanceof TextMessage) {
			TextMessage textMessage = (TextMessage) message;
			messageString = textMessage.getText();
			logger.debug("Received message: {}", messageString);

			GPSRecordParser p = GPSRecordParser.getParser();
			UTInfoBean currUTInfo = null;
			try {
				currUTInfo = p.parseSimple(messageString);
			} catch (JsonParseException e) {
				logger.error("Couldn't parse message string: {}", messageString);
				logger.error("JSON parse error: {}", STMUtils.getStackString(e.getStackTrace()));
				return new Long (-1);
			} catch (IOException e) {
				logger.error("Couldn't parse message string: {}", messageString);
				logger.error("IO error: {}", STMUtils.getStackString(e.getStackTrace()));
				return new Long (-1);
			}  
			
			STMGlobals.currAccessNetwork = currUTInfo.getAccessnetwork();
			
			switch (targetType) {
			
			case 0:
				logger.info("Consuming URS only - not posting to SPB");
				break;
			case 2:   // BGAN only
				if (currUTInfo.getAccessnetwork() == 2) {
					logger.debug("accessnetwork({}) BGAN and BGAN only send", currUTInfo.getAccessnetwork() );
					PostToSPB(currUTInfo);
				} else {
					return new Long (-1);
				}
				break;
			case 3:   // GX only
				if (currUTInfo.getAccessnetwork() == 3) {
					logger.debug("accessnetwork({}) GX and GX only send", currUTInfo.getAccessnetwork() );
					PostToSPB(currUTInfo);
				} else {
					return new Long (-1);
				}
				break;
				
			case 23:   // Both BGAN and GX
			case 32:   // Both BGAN and GX
				if (currUTInfo.getAccessnetwork() == 2 || currUTInfo.getAccessnetwork() == 3) {
					logger.debug("accessnetwork({}) BGAN or GX  and BGAN or GX send", currUTInfo.getAccessnetwork() );
					PostToSPB(currUTInfo);
				} else {
					return new Long (-1);
				}
				break;
			default:
				logger.warn("Invalid targetType: {}", targetType );
			}

			return currUTInfo.getCapture();

		} else {
			logger.error("Message not TextMessage");
		}
		return new Long(0);
	}

	public synchronized void onException(JMSException ex) {
		logger.error("JMS Exception occured.  Shutting down client. See stack trace below");
		logger.error("JSM Exception Stack Trace: {}", STMUtils.getStackString(ex.getStackTrace()));
	}
	
	private boolean PostToSPB(UTInfoBean currUTInfo) {
		
		PostToSPBTable actTable = PostToSPBTable.getTable();

		//if (actTable.Invoke_PLE(currUTInfo)) {
		// Bypasses oracle call for off-net testing
		boolean processCurrentUT = true;
		if (STMGlobals.oracle_enabled)
			processCurrentUT = actTable.Invoke_PLE(currUTInfo);

		// if entered URS consume only sate, skip
		if (STMGlobals.URS_consume_only) {
			processCurrentUT = false;
			logger.debug("NOW is: {} FAIL is: {} Diff is: {} Monitor is: {}", System.currentTimeMillis(), STMGlobals.URS_consume_only_time,
					System.currentTimeMillis() - STMGlobals.URS_consume_only_time,  STMGlobals.SPB_recover_monitor);
			if ( System.currentTimeMillis() - STMGlobals.URS_consume_only_time > STMGlobals.SPB_recover_monitor) {
				logger.warn("Exiting URS consume only state. Re-attempting to post to SPBs.");
				STMGlobals.URS_consume_only = false;
				STMGlobals.URS_consume_only_time = 0L;
				STMGlobals.SPB_GX_failed = false;
				STMGlobals.SPB_BGAN_failed = false;
				STMGlobals.SPB_GX_failover = false;
				STMGlobals.SPB_BGAN_failover = false;

				processCurrentUT = true;
			}
		}


		if (processCurrentUT) {
			if ( currUTInfo.getAccessnetwork() == STMGlobals.accessNetBGAN ) {			
				if (GPSRecordConsumer.BGAN_message.size() < GPSRecordConsumer.BGAN_batch_size - 1) {
					GPSRecordConsumer.BGAN_message.add(currUTInfo);
					logger.debug("Added message to List. Current BGAN List size is: {}", GPSRecordConsumer.BGAN_message.size());
					return false;
				} else {
					GPSRecordConsumer.BGAN_message.add(currUTInfo);
					logger.debug("BGAN List size is:{} calling POST.", GPSRecordConsumer.BGAN_message.size());
					logger.debug("Current network is: {}", currUTInfo.getAccessnetwork());
					actTable.Post(currUTInfo);
					//empty BGAN_message
					GPSRecordConsumer.BGAN_message.clear();
					return true;
				}
			}	else {
				if (GPSRecordConsumer.GX_message.size() < GPSRecordConsumer.GX_batch_size - 1 ) {
					GPSRecordConsumer.GX_message.add(currUTInfo);
					logger.debug("Added message to GX List. Current List size is: {}", GPSRecordConsumer.GX_message.size());
					return false;
				} else {
					GPSRecordConsumer.GX_message.add(currUTInfo);
					logger.debug("GX List size is: {}  calling POST.", GPSRecordConsumer.GX_message.size() );
					logger.debug("Current network is: {}", currUTInfo.getAccessnetwork());
					actTable.Post(currUTInfo);
					//empty GX_message
					GPSRecordConsumer.GX_message.clear();
					return true;
				}
			}
		} else {
			return false;
		}
		
	}
}
