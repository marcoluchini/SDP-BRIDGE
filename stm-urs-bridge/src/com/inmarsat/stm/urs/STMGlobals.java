package com.inmarsat.stm.urs;

import com.inmarsat.stm.urs.DBUtils.TimeUnits;

public class STMGlobals {
	
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
	public static Long frexitProcessDelta = new Long(10000);
	
	// Default settings, overridden by properties file
	public static int DBConnectionInitialPoolSize = 1;
	public static int DBConnectionMaxPoolSize = 10;
	
	// Settings for sandvine endpoints should come from properties file
	public static String spburl_gx_primary = null;
	public static String spbuser_gx_primary = null;
	public static String spbpasswd_gx_primary = null;
	
	public static String spburl_bgan_primary = null;
	public static String spbuser_bgan_primary = null;
	public static String spbpasswd_bgan_primary = null;

	public static String spburl_gx_secondary = null;
	public static String spbuser_gx_secondary = null;
	public static String spbpasswd_gx_secondary = null;

	public static String spburl_bgan_secondary = null;
	public static String spbuser_bgan_secondary = null;
	public static String spbpasswd_bgan_secondary = null;

	// Tracking SPB endpoint status and failover
	public static boolean SPB_GX_failover = false;
	public static long SPB_GX_failover_time = 0;
	public static long SPB_GX_failover_timeout = 30000;
	public static boolean SPB_BGAN_failover = false;
	public static long SPB_BGAN_failover_time = 0;
	public static long SPB_BGAN_failover_timeout = SPB_GX_failover_timeout;

	public static boolean URS_consume_only = false;

	// SOAP debug setting in response, overridden in properties file
	public static boolean SOAP_debug = false;

	// Defaults for processing
	public static int targetType = accessNetBGAN;
	public static int currAccessNetwork = accessNetBGAN;
	
}

