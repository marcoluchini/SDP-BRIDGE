package com.inmarsat.stm.urs;

import java.io.IOException;

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

	public GPSRecordConsumerThread(String url, String subject, String username, String passwd, Long receiverTimeout, String spbusername, String spbpasswd, String spburl, String spbusername2, String spbpasswd2, String spburl2, Integer targetType ) {
		this.url = url;
		this.subject = subject;
		this.username = username;
		this.passwd = passwd;
		timeout = receiverTimeout;
		this.spburl = spburl;
		this.spbusername = spbusername;
		this.spbpasswd = spbpasswd;
		this.spburl2 = spburl2;
		this.spbusername2 = spbusername2;
		this.spbpasswd2 = spbpasswd2;
		this.targetType = targetType;
		
	}

	public void run() {

		String messageString = "";
		Connection connection = null;
		Session session = null;
		MessageConsumer consumer = null;
		try {

			ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
			connection = connectionFactory.createConnection(username, passwd);
			if (connection != null)
				logger.debug("Established connection");
			connection.start();
			connection.setExceptionListener(this);
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			if (session != null)
				logger.debug("Created session");
			Destination destination = session.createQueue(subject);
			if (destination != null)
				logger.debug("Created destination");
			consumer = session.createConsumer(destination);
			if (consumer != null)
				logger.debug("Created consumer.");

			boolean freActDone = false;
			while (!Thread.currentThread().isInterrupted()) {
				Message message = consumer.receive(timeout);
				if (message != null) {
					freActDone = false;
					Long messageTime = process(message, messageString);
					Long now = STMUtils.getCurrentTime();  
					// Scale timestamp to seconds for new URS feed -- set property GPSMessageTimeUnit = ms
					if (STMGlobals.gpsMessageTimeUnit == TimeUnits.MILLISECONDS) { 
						now = now / 1000; 
					} 				 
					
					logger.debug("now({}) -- messageTime({})", new Object[] { now.toString(), messageTime.toString() });
					if(messageTime <= 0)
					{
						logger.debug("Received negative time error signal, ignoring message.");
					}
					else if (now - messageTime < STMGlobals.frexitProcessDelta) {
						logger.info("Processing FRExit_Actions");
						if(processFRExitActions())
							freActDone = true;
					}

				} else {
					logger.info("Waiting for message - on {}ms loop.", timeout.toString());
					if (!freActDone) {
						logger.info("Processing FRExit_Actions");
						if(processFRExitActions())
							freActDone = true;
					}
				}
			}
		} catch (JMSException jms) {
			logger.error("JMS Error: {}", jms.getErrorCode());
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

	private boolean processFRExitActions() {
		
		return true;
	}

	private Long process(Message message, String messageString) throws JMSException {

		if (message instanceof TextMessage) {
			TextMessage textMessage = (TextMessage) message;
			messageString = textMessage.getText();
			logger.info("Received message: {}", messageString);

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
					logger.info("accessnetwork({}) BGAN and BGAN only send", currUTInfo.getAccessnetwork() );
					PostToSPB(currUTInfo);
				} else {
					return new Long (-1);
				}
				break;
			case 3:   // GX only
				if (currUTInfo.getAccessnetwork() == 3) {
					logger.info("accessnetwork({}) GX and GX only send", currUTInfo.getAccessnetwork() );
					PostToSPB(currUTInfo);
				} else {
					return new Long (-1);
				}
				break;
				
			case 23:   // Both BGAN and GX
			case 32:   // Both BGAN and GX
				if (currUTInfo.getAccessnetwork() == 2 || currUTInfo.getAccessnetwork() == 3) {
					logger.info("accessnetwork({}) BGAN or GX  and BGAN or GX send", currUTInfo.getAccessnetwork() );
					PostToSPB(currUTInfo);
				} else {
					return new Long (-1);
				}
				break;
			default:
				logger.info("Invalid targetType: {}", targetType );
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
