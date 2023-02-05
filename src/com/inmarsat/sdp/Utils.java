package com.inmarsat.sdp;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

public class Utils {
	
    //private static transient final Logger logger = LoggerFactory.getLogger(FREUtils.class);

    /**
     * Date initialised by milliseconds from epoc: January 1 1970 00:00:00
     * The time zone is defined in FREContstants - default is UTC
     * Warning: sql.Date has timezone as GMT.
     * @return
     */
    public static java.sql.Date getCurrentDate() {
    	Calendar cal = new GregorianCalendar(TimeZone.getTimeZone(Globals.TimeZone));
    	Long t = cal.getTimeInMillis();
    	return new java.sql.Date(t);
    	
    	//java.util.Date today = new java.util.Date(t);
        //return new java.sql.Date(today.getTime());
    }
    
    /**
     * Time in milliseconds from epoch: January 1 1970 00:00:00
     * The time zone is defined in Globals
     * @return
     */
    public static Long getCurrentTime() {
    	Calendar cal = new GregorianCalendar(TimeZone.getTimeZone(Globals.TimeZone));
    	return cal.getTimeInMillis();
    }
    
    /**
     * Assumes milliseconds from epoch: January 1, 1970, 00:00:00 GMT
     * @param milliSeconds
     * @return
     */
    public static Date getDate(Long milliSeconds) {
    	//GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone(FREConstants.TimeZone));
    	//cal.setTimeInMillis(millis);
    	return new Date(milliSeconds);
    }
    

   static String getCaller(StackTraceElement[] trace, String _class) {
       for(int i = 0; i < trace.length; i++) {
           System.out.println(Integer.toString(i) + " " + trace[i].getClassName());
           if(trace[i].getClassName().matches(".*?"+_class+".*?") && i < trace.length-1) {
               return trace[i+1].getClassName();
           }
       }
       return "Not found";
   }

   protected static String getStackString(StackTraceElement[] trace) {

       StringBuilder sb = new StringBuilder();
       for(StackTraceElement el: trace) {
           sb.append("\n\t\t");
           sb.append(el.toString());
       }
       return sb.toString();  
   }

   public static String printSQLException(SQLException ex) {

       StringBuilder sb = new StringBuilder();
       for (Throwable e : ex) {
           if (e instanceof SQLException) {
//           if (ignoreSQLException(
//               ((SQLException)e).
//               getSQLState()) == false)
               if (true) {

                   e.printStackTrace(System.err);
                   //System.err.println("SQLState: "
                   //        + ((SQLException) e).getSQLState());
                   sb.append("SQLState: ").append(((SQLException) e).getSQLState());
                   sb.append("\n");

                   //System.err.println("Error Code: "
                   //        + ((SQLException) e).getErrorCode());

                   sb.append("Error Code: ").append(((SQLException) e).getErrorCode());
                   sb.append("\n");
                   //System.err.println("Message: " + e.getMessage());

                   sb.append("Message: ").append(e.getMessage());
                   sb.append("\n");

                   Throwable t = ex.getCause();
                   while (t != null) {
                       sb.append("Cause: ").append(t).append("\n");
                       //System.out.println("Cause: " + t);
                       t = t.getCause();
                   }
               }
           }
       }
       return sb.toString();
   }

   public static boolean ignoreSQLException(String sqlState) {

       if (sqlState == null) {
           System.out.println("The SQL state is not defined!");
           return false;
       }

       // X0Y32: Jar file already exists in schema
       if (sqlState.equalsIgnoreCase("X0Y32")) {
           return true;
       }

       // 42Y55: Table already exists in schema
       if (sqlState.equalsIgnoreCase("42Y55")) {
           return true;
       }

       return false;
   }

	public static String stringToTbcd(String imsi) {

        // IMSI should always be 15 characters.
	// If it's not return a null string and exit.
	if (imsi.length() != 15)
            return null;

	//This is to store the end result.
	String result = "";

	//This is the byte array (intermediate result)
	byte[] bytes = new byte[8];

	//The below can be written as a loop
	//Note the padding on the last byte.
	bytes[0] = (byte) (((imsi.charAt(1) - 0x30) << 4)
				| (imsi.charAt(0) - 0x30));
	bytes[1] = (byte) (((imsi.charAt(3) - 0x30) << 4)
				| (imsi.charAt(2) - 0x30));
	bytes[2] = (byte) (((imsi.charAt(5) - 0x30) << 4)
				| (imsi.charAt(4) - 0x30));
	bytes[3] = (byte) (((imsi.charAt(7) - 0x30) << 4)
				| (imsi.charAt(6) - 0x30));
	bytes[4] = (byte) (((imsi.charAt(9) - 0x30) << 4)
				| (imsi.charAt(8) - 0x30));
	bytes[5] = (byte) (((imsi.charAt(11) - 0x30) << 4)
				| (imsi.charAt(10) - 0x30));
	bytes[6] = (byte) (((imsi.charAt(13) - 0x30) << 4)
				| (imsi.charAt(12) - 0x30));
	bytes[7] = (byte) ((0xf0) | (imsi.charAt(14) - 0x30));

        // Convert to a Hex string.
	for (int i=0; i < bytes.length; i++)
            result += Integer.toString( ( bytes[i] & 0xff ) + 0x100, 16).substring( 1 );

	return result;
    }
	


 }