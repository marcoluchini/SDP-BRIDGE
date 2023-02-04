package com.inmarsat.sdp;


import javax.jms.*;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
//import java.io.IOException;
//
//import org.codehaus.jackson.JsonGenerationException;
//import org.codehaus.jackson.map.JsonMappingException;
//import org.codehaus.jackson.map.ObjectMapper;

public class Producer {

	final static Logger logger = LoggerFactory.getLogger(Producer.class);
	
	private static String url = ActiveMQConnection.DEFAULT_BROKER_URL;
	private static String subject = "TESTQUEUE";
	//private static String username = "";
	//private static String passwd = "";
	private static String inputMessagesFile = "";
	private static String propsFilePath = "stm.properties";
	
	public static void main(String[] args) throws JMSException, InterruptedException {
		
		Properties prop = new Properties();
		InputStream input = null;
	 
		try {
			
			if (args.length == 1) { // assume it's a properties file and
				// nothing else
				propsFilePath = args[0];
			}

			input = new FileInputStream(propsFilePath);
	 
			// load a properties file
			prop.load(input);
			
			url = prop.getProperty("brokerURL");
			if(url == null || url == "" && args.length > 0) {
					url = args[0];
			}
			if (url == null || url.equalsIgnoreCase("default")){
				url=ActiveMQConnection.DEFAULT_BROKER_URL;;
			}
			
			//Note: no default value - must be set. 
			subject = prop.getProperty("subject");
			if(subject == null || url == "" && args.length > 1) {
				subject = args[1];
			}
			
//			username = prop.getProperty("username");
//			if(username == null || username == "" && args.length > 2) {
//				username = args[2];
//			}
//			
//			passwd = prop.getProperty("passwd");
//			if(passwd == null || passwd == "" && args.length > 3) {
//				passwd = args[3];
//			}
			
			inputMessagesFile = prop.getProperty("inputMessagesFile");
			if(inputMessagesFile == null || inputMessagesFile == "" && args.length > 4) {
				inputMessagesFile = args[4];
			}
			
	 
		} catch (IOException ex) {
			
			logger.error("IO Error on properties file", ex);
			logger.error("args.length: {}", args.length);
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
		
		
	    
		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(url);
		Connection connection = connectionFactory.createConnection();
		connection.start();
		
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		Destination destination = session.createQueue(subject);
		
		MessageProducer producer = session.createProducer(destination);	    
	    
		for(int i = 0; i < 1; i++)
		{
			pushMessages(session, producer, getMessages(), i);
			//Thread.sleep(5);
		}
	   
		connection.close();
	}
	
	public static void pushMessages(Session session, MessageProducer producer, ArrayList<String> lines, int round) throws JMSException {

		Iterator<String> iter = lines.iterator();
		String line = "";
		try {

	        while (iter.hasNext() ){
	        	line = iter.next();
	        	TextMessage message = session.createTextMessage(line);
	    		producer.send(message);
	    		System.out.println(Integer.toString(round) + " Sent message: '" + message.getText() + "'");      
	        }
	      }
	      finally {
	      }
	}
	
	public static ArrayList<String> getMessages()  {
		File aFile = new File(inputMessagesFile);
		ArrayList<String> lines = new ArrayList<String>();
	    try {
	    	
	      BufferedReader inputBuff =  new BufferedReader(new FileReader(aFile));
	      try {
	        String line = null; 

	        while (( line = inputBuff.readLine()) != null){
	        	
	        	lines.add(line);
	        	
	        	//TextMessage message = session.createTextMessage(line);
	    		//producer.send(message);
	    		//System.out.println("Sent message: '" + message.getText() + "'");      
	        }
	      }
	      finally {
	    	  inputBuff.close();
	      }
	    }
	    catch (IOException ex){
	      logger.error("Error reading messages", ex);
	    }
	    return lines;
	}
}
