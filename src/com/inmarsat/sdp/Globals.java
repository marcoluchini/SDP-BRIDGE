package com.inmarsat.sdp;

import com.inmarsat.sdp.DBUtils.TimeUnits;

public class Globals {
	
	public final static int accessNetBGAN = 2;
	public final static int accessNetGX = 3;

	// Settings for local oracle instance should come from properties file
	public static boolean oracle_enabled = false;
	
	public static String connectionURL = null;
	public static String user = null;
	public static String passwd = null;	
	
	public static String dateFormatString_11g = "DD-MON-YY HH24:MI:SS";
	public static String dateFormatString_javaUtil = "dd-MMM-yy hh:mm:ss";
	public static String TimeZone = "UTC";
	public static TimeUnits gpsMessageTimeUnit = TimeUnits.SECONDS;
	public static Long processDelta = new Long(10000);
	
	// Default settings, overridden by properties file
	public static int DBConnectionInitialPoolSize = 1;
	public static int DBConnectionMaxPoolSize = 10;
	
	public static long URS_inactivity_timeout = 60000;
	public static boolean URS_reset_connection = false;

	// Defaults for processing
	public static int targetType = accessNetBGAN;
	public static int currAccessNetwork = accessNetBGAN;
	
}

