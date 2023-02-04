package com.inmarsat.sdp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.jms.JMSException;

import org.apache.activemq.ActiveMQConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.inmarsat.sdp.beans.UTInfoBean;

public class RecordConsumer {

	final static Logger logger = LoggerFactory
			.getLogger(RecordConsumer.class);

	private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
	private static String subject = "TESTQUEUE";
	private static String username = "";
	private static String passwd = "";

	public static Long receiverTimeout = new Long(5000);
	public static Long receiverMonitorLoop = new Long(10000);

	
	public static ArrayList<UTInfoBean> BGAN_message = new ArrayList<UTInfoBean> ();
	public static ArrayList<UTInfoBean> GX_message = new ArrayList<UTInfoBean> ();

	public final static int batch_size_default = 5;
	public static int BGAN_batch_size = batch_size_default; // default values overwritten by properties file
	public static int GX_batch_size = batch_size_default;


	public static void main(String args[]) throws JMSException, InterruptedException {
			
		RecordConsumerThread messageReader = new RecordConsumerThread(args,
				url, subject, username, passwd, receiverTimeout, Globals.targetType );
		boolean keepRunning = keepRunning();
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(messageReader);
		//executor.wait();
		while (keepRunning) {
			if (Globals.URS_reset_connection) {
				logger.error("Resetting message reader thread.");
				Globals.URS_reset_connection = false;
				messageReader = new RecordConsumerThread(args,
						url, subject, username, passwd, receiverTimeout, Globals.targetType );
				executor.execute(messageReader);
			}
			try {
				Thread.sleep(receiverMonitorLoop);
				keepRunning = keepRunning();
			} catch (InterruptedException e) {
				logger.error("RecordConsumer main method interrupted. "
						+ "Shutting down consumer thread. See stack trace.");
				logger.error("", Utils.getStackString(e.getStackTrace()));
				keepRunning = false;
			}
		}
		logger.error("Shutting down consumer thread and exiting");
		executor.shutdownNow();
		if (!executor.awaitTermination(receiverMonitorLoop, TimeUnit.MILLISECONDS)) {
			logger.error("Still waiting after {}ms: calling System.exit(0)...", receiverMonitorLoop.toString());
			System.exit(0);
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
