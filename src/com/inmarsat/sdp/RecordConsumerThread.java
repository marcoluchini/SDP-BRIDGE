package com.inmarsat.sdp;

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
import com.fasterxml.jackson.core.JsonParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.inmarsat.sdp.DBUtils.TimeUnits;
import com.inmarsat.sdp.beans.UTInfoBean;
import com.inmarsat.sdp.beans.AssetInfoBean;

public class RecordConsumerThread implements Runnable, ExceptionListener {

	final static Logger logger = LoggerFactory.getLogger(RecordConsumerThread.class);

	private String url = ActiveMQConnection.DEFAULT_BROKER_URL;
	private String subject = "TESTQUEUE";
	private String username = "";
	private String passwd = "";
	Long timeout = new Long(1000);
	private Integer targetType = Globals.accessNetBGAN;

	public RecordConsumerThread(String args[], String url_in, String subject_in, String username_in, String passwd_in, Long receiverTimeout_in,  Integer targetType_in ) {
		this.url = url_in;
		this.subject = subject_in;
		this.username = username_in;
		this.passwd = passwd_in;
		timeout = receiverTimeout_in;
		this.targetType = targetType_in;

		// Globals.URS_consume_only = false; // Option to reset from URS consume only state

		String propsFilePath = "u2s.properties";


		Properties prop = new Properties();
		InputStream input = null;

		try {

			if (args.length == 1) { // assume it's a properties file or batch size and
				// nothing else
				try {
					RecordConsumer.BGAN_batch_size = Integer.parseInt(args[0]);
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
							RecordConsumer.BGAN_batch_size = Integer.parseInt(str_BGAN_batch_size);
						} catch(NumberFormatException e) {
							//not an int thus set default
							RecordConsumer.BGAN_batch_size = RecordConsumer.batch_size_default;
						}
					}

					String str_GX_batch_size = prop.getProperty("GX_batch");
					if (str_GX_batch_size != null) {
						try {
							RecordConsumer.GX_batch_size = Integer.parseInt(str_GX_batch_size);
						} catch(NumberFormatException e) {
							//not an int thus set default
							RecordConsumer.GX_batch_size = RecordConsumer.batch_size_default;
						}
					}

					String str_inactivityMonitor = prop.getProperty("inactivityMonitor");
					if (str_inactivityMonitor != null) {
						try {
							Globals.URS_inactivity_timeout= Integer.parseInt(str_inactivityMonitor);
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
							Globals.SPB_recover_monitor= Integer.parseInt(str_recoveryMonitor);
						} catch(NumberFormatException e) {
							//not an int thus set default
							logger.error("Invalid value for SPB recovery monitor. Using default of {}secs.", Globals.SPB_recover_monitor);
						}
					} else {
						logger.error("Failed to find settings value for SPB recovery monitor. Using default of {}secs.", Globals.SPB_recover_monitor);
					}

					String rto = prop.getProperty("receiverTimeOut");
					if (rto != null)
						RecordConsumer.receiverTimeout = Long.parseLong(rto);
					String rml = prop.getProperty("receiverMonitorLoop");
					if (rml != null)
						RecordConsumer.receiverMonitorLoop = Long.parseLong(rml);

					String dbconn = prop.getProperty("dbconnectionURL");
					if(dbconn != null)
						Globals.connectionURL=dbconn;
					String dbuser = prop.getProperty("dbuser");
					if(dbuser != null)
						Globals.user=dbuser;

					String dbpass = prop.getProperty("dbpasswd");
					if(dbpass != null)
						Globals.passwd=dbpass;

					String dbConnectionInitialPoolSize = prop.getProperty("dbConnectionInitialPoolSize");
					if(dbConnectionInitialPoolSize != null)
						Globals.DBConnectionInitialPoolSize=Integer.parseInt(dbConnectionInitialPoolSize);
					String dbConnectionMaxPoolSize = prop.getProperty("dbConnectionMaxPoolSize");
					if(dbConnectionMaxPoolSize != null)
						Globals.DBConnectionMaxPoolSize=Integer.parseInt(dbConnectionMaxPoolSize);

					String tz = prop.getProperty("TimeZone");
					if(tz != null)
						Globals.TimeZone=tz;

					String tu = prop.getProperty("GPSMessageTimeUnit");
					if(tu != null) {
						DBUtils.TimeUnits timeUnit = DBUtils.TimeUnits.getTimeUnit(tu);
						if(timeUnit.equals(DBUtils.TimeUnits.UNKNOWN)) {
							throw new IOException("Unkown time unit - check properties file.");
						}
						else {
							Globals.gpsMessageTimeUnit = timeUnit;
						}
					}

					String frd = prop.getProperty("frexitProcessDelta");
					if(frd != null)
						Globals.frexitProcessDelta=new Long(frd);


					String tgt = prop.getProperty("targetType");
					if (tgt != null) {
						Globals.targetType=Integer.parseInt(tgt);
						this.targetType=Integer.parseInt(tgt);
					}

					String ora = prop.getProperty("oracle_enabled");
					if (ora != null)
						Globals.oracle_enabled=Boolean.parseBoolean(ora);

				}
			}

			logger.info("Loaded Settings - user: {}; passwd: {}; subject: {}; url: {}",
					new Object[] { username, passwd, subject, url });
			logger.info("Current Settings - BGAN Batch: " + RecordConsumer.BGAN_batch_size + " GX Batch: " + RecordConsumer.GX_batch_size);
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
					Long messageTime = process(message, messageString);   // This call actually processes the message...
					Long now = Utils.getCurrentTime();  
					// Scale timestamp to seconds for new URS feed -- set property GPSMessageTimeUnit = ms
					if (Globals.gpsMessageTimeUnit == TimeUnits.SECONDS) { 
						now = now / 1000; 
					} 				 
					
					logger.debug("now({}) -- messageTime({})", new Object[] { now.toString(), messageTime.toString() });
					if(messageTime <= 0)
					{
						logger.debug("Received negative time error signal, ignoring message.");
					}
					else if (now - messageTime < Globals.frexitProcessDelta) {
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
					if (inactivityMonitor >= Globals.URS_inactivity_timeout) {
						Globals.URS_reset_connection = true;
						logger.warn("Preparing to reset consumer thread. Trying to close JMS connection...");
						try {
							if (consumer != null) consumer.close();
							if (session != null) session.close();
							if (connection != null) connection.close();
							if (consumer != null) consumer.close();
							logger.warn("JMS connection closed due to inactivity.");
							logger.warn("Creating new JMS connection to URS.");
						} catch (JMSException jmsEx) {
							logger.error("Couldn't close JMS connection during inactivity reset: {}", Utils.getStackString(jmsEx.getStackTrace()));
						}
						return;
					}

				}
			}
		} catch (JMSException jms) {
			logger.error("JMS Error: {}", jms.getErrorCode());
			logger.error("JMS Cause: {}", jms.getCause());
			logger.error("Stack Trace: {}", Utils.getStackString(jms.getStackTrace()));

		} catch (Exception exception) {
			logger.error("Error: ", exception);
			logger.error("Stack Trace: {}", Utils.getStackString(exception.getStackTrace()));
		} finally {
			try {
				logger.debug("Trying to close JMS connection...");
				if (consumer != null) consumer.close();
				if (session != null) session.close();
				if (connection != null) connection.close();
				if (consumer != null) consumer.close();
				logger.debug("JMS connection closed.");
			} catch (JMSException jmsEx) {
				logger.error("Couldn't close JMS connection: {}", Utils.getStackString(jmsEx.getStackTrace()));
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
            logger.error("Stack Trace: {}", Utils.getStackString(jms.getStackTrace()));
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
				logger.error("Stack Trace: {}", Utils.getStackString(jms.getStackTrace()));

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

			SDPAssetRecordParser p = SDPAssetRecordParser.getParser();
			UTInfoBean currUTInfo = null;
			AssetInfoBean currAssetInfo = null;
			try {
				currAssetInfo = p.parseAsset(messageString);
			} catch (JsonParseException e) {
				logger.error("Couldn't parse message string: {}", messageString);
				logger.error("JSON parse error: {}", Utils.getStackString(e.getStackTrace()));
				return new Long (-1);
			} catch (IOException e) {
				logger.error("Couldn't parse message string: {}", messageString);
				logger.error("IO error: {}", Utils.getStackString(e.getStackTrace()));
				return new Long (-1);
			}  
			
					PostToOracle(currAssetInfo);
		} else {
			logger.error("Message not TextMessage");
		}
		return new Long(0);
	}

	public synchronized void onException(JMSException ex) {
		logger.error("JMS Exception occured.  Shutting down client. See stack trace below");
		logger.error("JSM Exception Stack Trace: {}", Utils.getStackString(ex.getStackTrace()));
	}
	
	private boolean PostToSPB(UTInfoBean currUTInfo) {
		
		PostToSPBTable actTable = PostToSPBTable.getTable();

		boolean processCurrentUT = true;

		// if entered URS consume only state, skip
		if (Globals.URS_consume_only) {
			processCurrentUT = false;
			logger.debug("NOW is: {} FAIL is: {} Diff is: {} Monitor is: {}", System.currentTimeMillis(), Globals.URS_consume_only_time,
					System.currentTimeMillis() - Globals.URS_consume_only_time,  Globals.SPB_recover_monitor);
			if ( System.currentTimeMillis() - Globals.URS_consume_only_time > Globals.SPB_recover_monitor) {
				logger.warn("Exiting URS consume only state. Re-attempting to post to SPBs.");
				Globals.URS_consume_only = false;
				Globals.URS_consume_only_time = 0L;
				Globals.SPB_GX_failed = false;
				Globals.SPB_BGAN_failed = false;
				Globals.SPB_GX_failover = false;
				Globals.SPB_BGAN_failover = false;

				processCurrentUT = true;
			}
		}


		if (processCurrentUT) {
			if ( currUTInfo.getAccessnetwork() == Globals.accessNetBGAN ) {			
				if (RecordConsumer.BGAN_message.size() < RecordConsumer.BGAN_batch_size - 1) {
					RecordConsumer.BGAN_message.add(currUTInfo);
					logger.debug("Added message to List. Current BGAN List size is: {}", RecordConsumer.BGAN_message.size());
					return false;
				} else {
					RecordConsumer.BGAN_message.add(currUTInfo);
					logger.debug("BGAN List size is:{} calling POST.", RecordConsumer.BGAN_message.size());
					logger.debug("Current network is: {}", currUTInfo.getAccessnetwork());
					actTable.Post(currUTInfo);
					//empty BGAN_message
					RecordConsumer.BGAN_message.clear();
					return true;
				}
			}	else {
				if (RecordConsumer.GX_message.size() < RecordConsumer.GX_batch_size - 1 ) {
					RecordConsumer.GX_message.add(currUTInfo);
					logger.debug("Added message to GX List. Current List size is: {}", RecordConsumer.GX_message.size());
					return false;
				} else {
					RecordConsumer.GX_message.add(currUTInfo);
					logger.debug("GX List size is: {}  calling POST.", RecordConsumer.GX_message.size() );
					logger.debug("Current network is: {}", currUTInfo.getAccessnetwork());
					actTable.Post(currUTInfo);
					//empty GX_message
					RecordConsumer.GX_message.clear();
					return true;
				}
			}
		} else {
			return false;
		}
		
	}

	private boolean PostToOracle(AssetInfoBean currAssetInfo) {
		
		PostToSPBTable actTable = PostToSPBTable.getTable();

					return actTable.ProcessAsset(currAssetInfo);
	}

}
