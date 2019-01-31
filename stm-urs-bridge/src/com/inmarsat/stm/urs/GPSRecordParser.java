package com.inmarsat.stm.urs;

import java.io.IOException;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.inmarsat.stm.urs.beans.UTInfoBean;

public class GPSRecordParser {
	
	final static Logger logger = LoggerFactory.getLogger(GPSRecordParser.class);

	ObjectMapper mapper = null; //new ObjectMapper();
	JsonFactory factory = null; //mapper.getJsonFactory(); // since 2.1 use mapper.getFactory() instead
	
	private static GPSRecordParser parser = null;
	private GPSRecordParser() {
		mapper = new ObjectMapper();
		factory = mapper.getJsonFactory(); // since 2.1 use mapper.getFactory() instead
	}
	
	public static GPSRecordParser getParser() {
		if(parser == null) 
			parser = new GPSRecordParser();
		return parser;
	}
	
	public UTInfoBean parseSimple(String gpsRecordJsonString) throws JsonParseException, IOException {

		Long imsi = null;
		Integer sac = null;
		Integer accessnetwork = null;
		Double latitude = null;
		Double longitude = null;
		String sense1 = null;
		String sense2 = null;
		Integer beamId = null;
		String satelliteId = null;
		
		
		JsonParser jp = factory.createJsonParser(gpsRecordJsonString);
		JsonNode record = mapper.readTree(jp);
		
		JsonNode imsiNode = record.findValue("accessid");
		imsi = imsiNode.getValueAsLong();
		
		JsonNode accessnetworkNode = record.findValue("accessnetwork");
		accessnetwork = accessnetworkNode.getValueAsInt();
		
		JsonNode sacNode = record.findValue("sac");
		sac = sacNode.getValueAsInt();
		
		JsonNode latitudeNode = (record.findValue("latitude")).findValue("position");
		JsonNode senseNode1 = (record.findValue("latitude")).findValue("sense");
		sense1 = senseNode1.getValueAsText();
		if (sense1.equals("S")) 
		{
			latitude = - latitudeNode.getValueAsDouble();
		} 
		else
		{
			latitude = latitudeNode.getValueAsDouble();
		}

		JsonNode longitudeNode = (record.findValue("longitude")).findValue("position");
		JsonNode senseNode2 = (record.findValue("longitude")).findValue("sense");
		sense2 = senseNode2.getValueAsText();
		if (sense2.equals("W")) 
		{
			longitude = - longitudeNode.getValueAsDouble();
		} 
		else
		{
			longitude = longitudeNode.getValueAsDouble();
		}
				
		JsonNode captureNode = record.findValue("capture");
		Long capture = captureNode.getLongValue();
		
		JsonNode beamIdNode = record.findValue("beamid");
		beamId = beamIdNode.getValueAsInt();
		
		JsonNode satelliteIdNode = record.findValue("satelliteid");
		if (satelliteIdNode != null) {
			satelliteId = satelliteIdNode.getValueAsText();
		}
		else 
		{
			satelliteId = "";
		}
		
		UTInfoBean bean = new UTInfoBean(imsi, sac, capture, accessnetwork, latitude, longitude, beamId, satelliteId); //default: status = 0, date = now
		bean.setCapture(capture, FREConstants.gpsMessageTimeUnit);
		//bean.setDate(capture);

		logger.info("Parsed JSON - IMSI: {}; SAC: {}, Latitude: {}, {}, Longitude: {}, {}, Capture: {}, beamid {}, satelliteid {}", new Object[] {imsi, sac, latitude, sense1, longitude, sense2, capture, beamId, satelliteId});
		
		return bean;
		
	}
	
	
}
