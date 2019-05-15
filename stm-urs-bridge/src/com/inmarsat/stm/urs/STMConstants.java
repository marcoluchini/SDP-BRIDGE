package com.inmarsat.stm.urs;

import java.util.HashMap;
import java.util.Map;

import com.inmarsat.stm.urs.DBUtils.TimeUnits;

public class STMConstants {

	public static String connectionURL = "jdbc:oracle:thin:@//192.168.1.22:1521/xe";
	public static String user = "fre1";
	public static String passwd = "fre1";
	public static String dateFormatString_11g = "DD-MON-YY HH24:MI:SS";
	public static String dateFormatString_javaUtil = "dd-MMM-yy hh:mm:ss";
	public static int DBConnectionInitialPoolSize = 1;
	public static int DBConnectionMaxPoolSize = 10;
	public static String TimeZone = "UTC";
	public static TimeUnits gpsMessageTimeUnit = TimeUnits.SECONDS;
	public static Long frexitProcessDelta = new Long(10000);
	public static String spburl = "http://localhost:8080/SubscriberServices/SubscriberServices";
	public static String spbuser = "sv_admin";
	public static String spbpasswd = "sandvine";
	public static String spburl2 = "http://localhost:8080/SubscriberServices/SubscriberServices";
	public static String spbuser2 = "sv_admin";
	public static String spbpasswd2 = "sandvine";
	public static int targetType = 2;
	public static int currAccessNetwork = 2;
	
	public final static int accessNetBGAN = 2;
	public final static int accessNetGX = 3;
	
	public final static Map<String, Integer> accessNet = createAccessNets();

	private final static Map<String, Integer> createAccessNets() {
	    Map<String, Integer> myMap = new HashMap<String, Integer>();
	    myMap.put("BGAN", 2);
	    myMap.put("GX", 3);
	    return myMap;
	}
	
	public static boolean oracle_enabled;
	
}

