package com.inmarsat.sdp;

import java.io.IOException;
import java.io.StringWriter;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
