package com.inmarsat.stm.urs;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.jms.JMSException;

import org.apache.activemq.ActiveMQConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GPSRecordConsumer {

	final static Logger logger = LoggerFactory
			.getLogger(GPSRecordConsumer.class);

	private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
	private static String subject = "TESTQUEUE";
	private static String username = "";
	private static String passwd = "";
	private static String propsFilePath = "C:\\Users\\MarcoLuchini\\eclipse-workspace\\stm-urs-bridge\\src\\com\\inmarsat\\stm\\urs\\stm.properties";
	private static Long receiverTimeout = new Long(5000);
	private static Long receiverMonitorLoop = new Long(10000);
	private static String spbusername = "";
	private static String spbpasswd = "";
	private static String spburl = "";
	private static int targetType = 2;
	

	public static void main(String args[]) throws JMSException, InterruptedException {

		Properties prop = new Properties();
		InputStream input = null;

		try {

			if (args.length == 1) { // assume it's a properties file and
									// nothing else
				propsFilePath = args[0];
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
					String rto = prop.getProperty("receiverTimeOut");
					if (rto != null)
						receiverTimeout = Long.parseLong(rto);
					String rml = prop.getProperty("receiverMonitorLoop");
					if (rml != null)
						receiverMonitorLoop = Long.parseLong(rml);
					
					String dbconn = prop.getProperty("dbconnectionURL");
					if(dbconn != null)
						FREConstants.connectionURL=dbconn;
					String dbuser = prop.getProperty("dbuser");
					if(dbuser != null)
						FREConstants.user=dbuser;
					
					String dbpass = prop.getProperty("dbpasswd");
					if(dbpass != null)
						FREConstants.passwd=dbpass;
					
					String dbConnectionInitialPoolSize = prop.getProperty("dbConnectionInitialPoolSize");
					if(dbConnectionInitialPoolSize != null)
						FREConstants.DBConnectionInitialPoolSize=Integer.parseInt(dbConnectionInitialPoolSize);
					String dbConnectionMaxPoolSize = prop.getProperty("dbConnectionMaxPoolSize");
					if(dbConnectionMaxPoolSize != null)
						FREConstants.DBConnectionMaxPoolSize=Integer.parseInt(dbConnectionMaxPoolSize);
					
					String tz = prop.getProperty("TimeZone");
					if(tz != null)
						FREConstants.TimeZone=tz;
					
					String tu = prop.getProperty("GPSMessageTimeUnit");
					if(tu != null) {
						DBUtils.TimeUnits timeUnit = DBUtils.TimeUnits.getTimeUnit(tu);
						if(timeUnit.equals(DBUtils.TimeUnits.UNKNOWN)) {
							throw new IOException("Unkown time unit - check properties file.");
						}
						else {
							FREConstants.gpsMessageTimeUnit = timeUnit;
						}
					}
					
					String frd = prop.getProperty("frexitProcessDelta");
					if(frd != null)
						FREConstants.frexitProcessDelta=new Long(frd);
					
					String spburl = prop.getProperty("spburl");
					if(spburl != null)
						FREConstants.spburl=spburl;
					
					String spbuser = prop.getProperty("spbuser");
					if(spbuser != null)
						FREConstants.spbuser=spbuser;
					
					String spbpass = prop.getProperty("spbpasswd");
					if(spbpass != null)
						FREConstants.spbpasswd=spbpass;
					
					String tgt = prop.getProperty("targetType");
					if (tgt != null)
						FREConstants.targetType=Integer.parseInt(tgt);
					
				}
			}

			logger.info("Loaded Settings - user: {}; passwd: {}; subject: {}; url: {}",
					new Object[] { username, passwd, subject, url });
			
			logger.info("Loaded Settings - spb user: {}; spb passwd: {}; spb url: {}",
					new Object[] { FREConstants.spbuser, FREConstants.spbpasswd, FREConstants.spburl });
			
			GPSRecordConsumerThread messageReader = new GPSRecordConsumerThread(
					url, subject, username, passwd, receiverTimeout, FREConstants.spbuser, FREConstants.spbpasswd, FREConstants.spburl, FREConstants.targetType );
			boolean keepRunning = keepRunning();
			ExecutorService executor = Executors.newSingleThreadExecutor();
			executor.execute(messageReader);
			//executor.wait();
			while (keepRunning) {
				try {
					Thread.sleep(receiverMonitorLoop);
					keepRunning = keepRunning();
				} catch (InterruptedException e) {
					logger.error("GPSRecordConsumer main method interrupted. "
							+ "Shutting down consumer thread. See stack trace.");
					logger.error("", FREUtils.getStackString(e.getStackTrace()));
					keepRunning = false;
				}
			}
			logger.info("Shutting down consumber thread and exiting");
			executor.shutdownNow();
		    if (!executor.awaitTermination(receiverMonitorLoop, TimeUnit.MILLISECONDS)) {
		        logger.info("Still waiting after {}ms: calling System.exit(0)...", receiverMonitorLoop.toString());
		        System.exit(0);
		    }
//		    System.out.println("Exiting normally...");
//		    executor.awaitTermination(checkConsumerTimeout, TimeUnit.MILLISECONDS);
//		    logger.info("Finished all threads");

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

	public static void thread(Runnable runnable, boolean daemon) {
		Thread brokerThread = new Thread(runnable);
		brokerThread.setDaemon(daemon);
		brokerThread.start();
	}
	
	String stopFile = "";
	private static boolean keepRunning() {
		
		return true; //TODO: termination condition
	}
	
}
