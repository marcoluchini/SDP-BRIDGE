package com.inmarsat.sdp;

import java.io.IOException;
import java.io.StringWriter;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.inmarsat.sdp.beans.UTInfoBean;
import com.inmarsat.sdp.beans.AssetInfoBean;

public class SDPAssetRecordParser {
	
	final static Logger logger = LoggerFactory.getLogger(SDPAssetRecordParser.class);

	ObjectMapper mapper = null; //new ObjectMapper();
	JsonFactory factory = null; //mapper.getJsonFactory(); // since 2.1 use mapper.getFactory() instead
	
	private static SDPAssetRecordParser parser = null;
	private SDPAssetRecordParser() {
		mapper = new ObjectMapper();
		factory = mapper.getFactory();
	}
	
	public static SDPAssetRecordParser getParser() {
		if(parser == null) 
			parser = new SDPAssetRecordParser();
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
		
		
		JsonParser jp = factory.createParser(gpsRecordJsonString);
		JsonNode record = mapper.readTree(jp);
		
		JsonNode imsiNode = record.findValue("accessid");
		imsi = imsiNode.asLong();
		
		JsonNode accessnetworkNode = record.findValue("accessnetwork");
		accessnetwork = accessnetworkNode.asInt();
		
		JsonNode sacNode = record.findValue("sac");
		sac = sacNode.asInt();
		
		JsonNode latitudeNode = (record.findValue("latitude")).findValue("position");
		JsonNode senseNode1 = (record.findValue("latitude")).findValue("sense");
		sense1 = senseNode1.asText();
		if (sense1.equals("S")) 
		{
			latitude = - latitudeNode.asDouble();
		} 
		else
		{
			latitude = latitudeNode.asDouble();
		}

		JsonNode longitudeNode = (record.findValue("longitude")).findValue("position");
		JsonNode senseNode2 = (record.findValue("longitude")).findValue("sense");
		sense2 = senseNode2.asText();
		if (sense2.equals("W")) 
		{
			longitude = - longitudeNode.asDouble();
		} 
		else
		{
			longitude = longitudeNode.asDouble();
		}
				
		JsonNode captureNode = record.findValue("capture");
		Long capture = captureNode.asLong();
		
		JsonNode beamIdNode = record.findValue("beamid");
		beamId = beamIdNode.asInt();
		
		JsonNode satelliteIdNode = record.findValue("satelliteid");
		if (satelliteIdNode != null) {
			satelliteId = satelliteIdNode.asText();
		}
		else 
		{
			satelliteId = "";
		}
		
		UTInfoBean bean = new UTInfoBean(imsi, sac, capture, accessnetwork, latitude, longitude, beamId, satelliteId); //default: status = 0, date = now
		bean.setCapture(capture, Globals.gpsMessageTimeUnit);
		//bean.setDate(capture);

		logger.debug("Parsed JSON - IMSI: {}; SAC: {}, Latitude: {}, {}, Longitude: {}, {}, Capture: {}, beamid {}, satelliteid {}", new Object[] {imsi, sac, latitude, sense1, longitude, sense2, capture, beamId, satelliteId});
		
		return bean;
		
	}
	
	public AssetInfoBean parseAsset(String RecordJsonString) throws JsonParseException, IOException {

		//convert JSON string to object
		AssetInfoBean asset = mapper.readValue(RecordJsonString, AssetInfoBean.class);
		
		//configure ObjectMapper for pretty print
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		
		StringWriter stringAsset = new StringWriter();
		mapper.writeValue(stringAsset, asset);
		System.out.println("Asset JSON is\n" + stringAsset);
		
		return asset;
		
	}
	
}
