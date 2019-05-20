/**
 * 
 */
package com.inmarsat.stm.urs;

import java.net.URL;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.axis.AxisProperties;
import org.apache.axis.Handler;
import org.apache.axis.SimpleChain;
import org.apache.axis.SimpleTargetedChain;
import org.apache.axis.client.AxisClient;
import org.apache.axis.configuration.SimpleProvider;
import org.apache.axis.transport.http.HTTPSender;
import org.apache.axis.transport.http.HTTPTransport;
import org.apache.axis.client.Stub;

import com.inmarsat.stm.urs.beans.UTInfoBean;
import com.sandvine.subscriberservices.ws.BulkOperationFailureBehaviour;
import com.sandvine.subscriberservices.ws.Result;
import com.sandvine.subscriberservices.ws.SetSubscriberAttributeParameterSet;
import com.sandvine.subscriberservices.ws.SetSubscriberAttributesRequest;
import com.sandvine.subscriberservices.ws.SetSubscriberAttributesResponse;
import com.sandvine.subscriberservices.ws.SubscriberAttributeDefinitionKey;
import com.sandvine.subscriberservices.ws.SubscriberKey;
import com.sandvine.subscriberservices.ws.SubscriberRealmKey;
import com.sandvine.subscriberservices.ws.SubscriberServices_PortType;
import com.sandvine.subscriberservices.ws.SubscriberServices_ServiceLocator;

/**
 * @author MarcoLuchini
 *
 */
public class PostToSPBTable {

	final static Logger logger = LoggerFactory.getLogger(PostToSPBTable.class);

	private static PostToSPBTable table = null;
	private PostToSPBTable() {
		
	}
	
	public static PostToSPBTable getTable() {
		if(table == null) 
			table = new PostToSPBTable();
		return table;
	}
	
	public boolean Invoke_PLE(UTInfoBean entry) {

		Connection conn = null;
		CallableStatement cstmt = null;
		String sql = "BEGIN urs_ple(?, ?, ?, ?, ?, ?, ?, ?); END;";
		// id, SAC, LATITUDE, LONGITUDE, UNIXDATE, BEAM, SATELLITE, SENT

		try {
			conn = DBConnectionFactory.getFRExitConnection();

			cstmt = conn.prepareCall(sql);
			cstmt.setLong("p_ID", entry.getImsi());
			cstmt.setLong("p_UNIXDATE", entry.getCapture());
			cstmt.setLong("p_SAC", entry.getSac());
			cstmt.setDouble("p_LATITUDE", entry.getLatitude());
			cstmt.setDouble("p_LONGITUDE", entry.getLongitude());
			cstmt.setLong("p_BEAM", entry.getBeamid());
			cstmt.setString("p_SATELLITE", entry.getSatelliteid());
//			cstmt.setString(5, FREUtils.stringToTbcd(entry.getImsiAsString()));
			cstmt.registerOutParameter("SEND", Types.VARCHAR);

			cstmt.execute();

			if (cstmt.getString("SEND").equals("Y")) {
				return true;
			} else {
				return false;
			}

		} catch (SQLException e) {
			logger.error("Couldn't complete update: {}", sql);
			logger.error(STMUtils.printSQLException(e));
			e.printStackTrace();
			return false;
		} finally {
			try {
				DBUtils.close(cstmt);
				DBUtils.close(conn);
			} catch (Exception conEX) {
				logger.error("Couldn't close db connection.");
				logger.error(STMUtils.getStackString(conEX.getStackTrace()));
			}
		}

	}

	
		public boolean Post(UTInfoBean currUTInfo) {

		SimpleProvider clientConfig = configureAxisLogger ();

		try {
			URL newLocation;
			if ( currUTInfo.getAccessnetwork() == STMGlobals.accessNetGX ) {
				newLocation = new URL(STMGlobals.spburl_gx_primary );
			} else {
				newLocation = new URL(STMGlobals.spburl_bgan_primary );
			};
			SubscriberServices_ServiceLocator locator = new SubscriberServices_ServiceLocator();
			SubscriberServices_PortType subscriberServicesPort = locator.getSubscriberServicesPort(newLocation);
			// SubscriberServices_PortType subscriberServicesPort =
			// locator.getSubscriberServicesPort();
			org.apache.axis.client.Stub s = (Stub) subscriberServicesPort;
			s.setTimeout(1000);
			AxisProperties.setProperty(org.apache.axis.components.net.DefaultCommonsHTTPClientProperties.CONNECTION_DEFAULT_SO_TIMEOUT_KEY, "1000");


			locator.setEngineConfiguration(clientConfig);
			locator.setEngine(new AxisClient(clientConfig));

			SetSubscriberAttributesRequest request = new SetSubscriberAttributesRequest();
			request.setDebug(true);
			request.setResultOnly(true);
			if ( currUTInfo.getAccessnetwork() == STMGlobals.accessNetGX) {
				request.setSubscriberAutoCreate(true);				
			} else {
				request.setSubscriberAutoCreate(false);
			};
			
			//Now that we are batching multiple IMSIs in one bulk request we must set this to AllowPartialFailure
			//because not all IMSIs may be known for BGAN.  If we were doing only one IMSI then AllOrNothing would be the valid behaviour

			request.setBulkOperationFailureBehaviour(BulkOperationFailureBehaviour.AllowPartialFailure);
			
			// Array attributeparamsets of type attributeparamset...
			SetSubscriberAttributeParameterSet[] setSubscriberAttributeParameterSets;

			int currentBatchSize = 0;
			if (currUTInfo.getAccessnetwork() == STMGlobals.accessNetBGAN) {
				currentBatchSize = GPSRecordConsumer.BGAN_batch_size;
			} else if (currUTInfo.getAccessnetwork() == STMGlobals.accessNetGX) {
				currentBatchSize = GPSRecordConsumer.GX_batch_size;
			}	
			setSubscriberAttributeParameterSets = new SetSubscriberAttributeParameterSet[currentBatchSize*4];
			logger.debug("Current network is:" + currUTInfo.getAccessnetwork() + " and batch size: " + currentBatchSize);
			
			for (int i=0; i<currentBatchSize; i++) {
				if (currUTInfo.getAccessnetwork() == STMGlobals.accessNetBGAN) {
					logger.debug("Current BGAN List size is:" + GPSRecordConsumer.BGAN_message.size());
					logger.debug("Processing record:" + (GPSRecordConsumer.BGAN_batch_size - i -1) );			
					currUTInfo = GPSRecordConsumer.BGAN_message.remove(GPSRecordConsumer.BGAN_batch_size - i -1);
					logger.debug("After processing BGAN List size is:" + GPSRecordConsumer.BGAN_message.size());
				} else {
					logger.debug("Current GX List size is:" + GPSRecordConsumer.GX_message.size());
					logger.debug("Processing record:" + (GPSRecordConsumer.GX_batch_size - i -1) );			
					currUTInfo = GPSRecordConsumer.GX_message.remove(GPSRecordConsumer.GX_batch_size - i -1);
					logger.debug("After processing GX List size is:" + GPSRecordConsumer.GX_message.size());

				}
				
				SubscriberKey subscriberKey = new SubscriberKey();
				subscriberKey.setName(currUTInfo.getImsiAsString());
				SubscriberRealmKey realmKey = new SubscriberRealmKey();
				realmKey.setName("DEFAULT");
				subscriberKey.setSubscriberRealmKey(realmKey);
	
				SetSubscriberAttributeParameterSet SubSets1 = new SetSubscriberAttributeParameterSet();
				SetSubscriberAttributeParameterSet SubSets2 = new SetSubscriberAttributeParameterSet();
				SetSubscriberAttributeParameterSet SubSets3 = new SetSubscriberAttributeParameterSet();
				SetSubscriberAttributeParameterSet SubSets4 = new SetSubscriberAttributeParameterSet();
				SubscriberAttributeDefinitionKey SubAtt1 = new SubscriberAttributeDefinitionKey();
				SubscriberAttributeDefinitionKey SubAtt2 = new SubscriberAttributeDefinitionKey();
				SubscriberAttributeDefinitionKey SubAtt3 = new SubscriberAttributeDefinitionKey();
				SubscriberAttributeDefinitionKey SubAtt4 = new SubscriberAttributeDefinitionKey();
	
				SubSets1.setSubscriberKey(subscriberKey);
				SubAtt1.setName("SatelliteID");
				SubSets1.setSubscriberAttributeDefinitionKey(SubAtt1);
				SubSets1.setValue(currUTInfo.getSatelliteid());
	
				SubSets2.setSubscriberKey(subscriberKey);
				SubAtt2.setName("BeamID");
				SubSets2.setSubscriberAttributeDefinitionKey(SubAtt2);
				SubSets2.setValue(Integer.toString(currUTInfo.getBeamid()));
	
				SubSets3.setSubscriberKey(subscriberKey);
				SubAtt3.setName("SAC");
				SubSets3.setSubscriberAttributeDefinitionKey(SubAtt3);
				SubSets3.setValue(currUTInfo.getSacAsString());
	
				SubSets4.setSubscriberKey(subscriberKey);
				SubAtt4.setName("Coordinate");
				SubSets4.setSubscriberAttributeDefinitionKey(SubAtt4);
				SubSets4.setValue(Double.toString(currUTInfo.getLatitude()) + "," + Double.toString(currUTInfo.getLongitude()));
	
				setSubscriberAttributeParameterSets[i*4] = SubSets1;
				setSubscriberAttributeParameterSets[i*4+1] = SubSets2;
				setSubscriberAttributeParameterSets[i*4+2] = SubSets3;
				setSubscriberAttributeParameterSets[i*4+3] = SubSets4;
			}
			
			request.setSetSubscriberAttributeParameterSets(setSubscriberAttributeParameterSets);

			SetSubscriberAttributesResponse response = subscriberServicesPort.setSubscriberAttributes(request);

			// Check the response code for SUCCESS
			if (response.getResult().equals(Result.Success)) {
				System.out.println("SUCCESS!!!");
				return true;
			} else {
				System.out.println("FAILURE!!!");
				return false;
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			return true;
	}

	private static SimpleProvider configureAxisLogger() {
		SimpleProvider clientConfig = new SimpleProvider();
		AxisLogHandler logHandler = new AxisLogHandler();
		SimpleChain reqHandler = new SimpleChain();
		SimpleChain respHandler = new SimpleChain();
		reqHandler.addHandler(logHandler);
		respHandler.addHandler(logHandler);
		Handler pivot = new HTTPSender();
		Handler transport = new SimpleTargetedChain(reqHandler, pivot, respHandler);
		clientConfig.deployTransport(HTTPTransport.DEFAULT_TRANSPORT_NAME, transport);
		return clientConfig;
	}

}
