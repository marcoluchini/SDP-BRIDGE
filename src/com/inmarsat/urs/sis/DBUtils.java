package com.inmarsat.urs.sis;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

//import org.apache.commons.dbutils.DbUtils;
import org.slf4j.Logger;

public class DBUtils {

	
	public static void close(CallableStatement cstmt) throws SQLException {
		if(cstmt != null)
			cstmt.close();
	}	
	
	public static void close(PreparedStatement pstmt) throws SQLException {
		if(pstmt != null)
			pstmt.close();
	}
	
	public static void close(Statement stmt) throws SQLException {
		if(stmt != null)
			stmt.close();
	}
	
	public static void close(ResultSet rset) throws SQLException {
		if(rset != null) 
			rset.close();
	}
	
	public static void close(Connection conn) throws SQLException {
		if(conn != null)
			conn.close();
			conn = null;
	}

	
	public static boolean executeUpdateSql(String sql, Logger logger) {
		
		Connection conn = null; PreparedStatement pstmt = null; 
		int rows = 0;
		try {
			conn = DBConnectionFactory.getFRExitConnection();
			pstmt = conn.prepareStatement(sql);
			rows = pstmt.executeUpdate();
			logger.debug("{} row(s) effected in UT_INFO: {}", rows, sql);
			return true;

		} catch (SQLException sqlEx) {
			logger.error("Couldn't complete: {}", sql);
			logger.error("Rows effected: {}", rows);
			logger.error(Utils.printSQLException(sqlEx));
			return false;
		} catch (Exception ex) {

			logger.error("Couldn't complete: {}", sql);
			logger.error("Rows effected: {}", rows);
			logger.error("Stack Trace: {}",
			Utils.getStackString(ex.getStackTrace()));
			return false;

		} finally {
			try {
				DBUtils.close(pstmt);
				DBUtils.close(conn);
			} catch (Exception conEX) {
				logger.error("Couldn't close db connection.");
				logger.error(Utils.getStackString(conEX.getStackTrace()));
			}
		}
	}
	
	/**
	 * Assumes that conn and pstmt have been initialised
	 * @param conn
	 * @param pstmt
	 * @param sql
	 * @param logger
	 * @return
	 */
	public static boolean executeUpdatePreparedStatementOnConnection(Connection conn, PreparedStatement pstmt, String sql, Logger logger) {
		
		int rows = 0;
		try {
			//conn = DBConnectionFactory.getFRExitConnection();
			//pstmt = conn.prepareStatement(sql);
			rows = pstmt.executeUpdate();
			logger.debug("{} row(s) effected in UT_INFO: {}", rows, sql);
			return true;

		} catch (SQLException sqlEx) {
			logger.error("Couldn't complete: {}", sql);
			logger.error("Rows effected: {}", rows);
			logger.error(Utils.printSQLException(sqlEx));
			return false;
		} catch (Exception ex) {

			logger.error("Couldn't complete: {}", sql);
			logger.error("Rows effected: {}", rows);
			logger.error("Stack Trace: {}",
			Utils.getStackString(ex.getStackTrace()));
			return false;

		} finally {
			try {
				DBUtils.close(pstmt);
				DBUtils.close(conn);
			} catch (Exception conEX) {
				logger.error("Couldn't close db connection.");
				logger.error(Utils.getStackString(conEX.getStackTrace()));
			}
		}
	}

	/**
	 * Assumes conn and stat have been inititalised.  
	 * @param conn
	 * @param pstmt
	 * @param sql
	 * @param logger
	 * @return
	 */
	public static ResultSet executeQuerySql(Connection conn, Statement stat, String sql, Logger logger) {
		
		ResultSet rset = null;
		try {
			rset = stat.executeQuery(sql);
			return rset;
		} catch (SQLException sqlEx) {
			logger.error("Couldn't complete: {}", sql);
			logger.error(Utils.printSQLException(sqlEx));
		} catch (Exception ex) {

			logger.error("Couldn't complete: {}", sql);
			logger.error("Error: ", ex);
			logger.error("Stack Trace: {}",
			Utils.getStackString(ex.getStackTrace()));
		} finally {
			try {
				//Connection closing must be handled by calling function (because of ResultSet)
				//DbUtils.close(pstmt);
				//DbUtils.close(conn);
			} catch (Exception conEX) {
				logger.error("Couldn't close db connection.");
				logger.error(Utils.getStackString(conEX.getStackTrace()));
			}
		}
		return rset;
	}

	// 
	/**
	 * 
	 * @param capture
	 * @param UNITS
	 * @return String of the form: TO_DATE('19700101','yyyymmdd') + 1403132711/(24*60*60) 
	 */
	public static String toOracleDateString(Long capture, DBUtils.TimeUnits UNITS) {
		if(UNITS.equals(TimeUnits.MILLISECONDS))
			capture = capture/1000; //milliseconds to seconds
		StringBuilder sb = new StringBuilder();
		sb.append("TO_DATE(");
		sb.append("'19700101','yyyymmdd') + ");
		sb.append(capture.toString());
		sb.append("/(24*60*60)");
		return sb.toString();
	}
	
	public static String getDateAsSQLDateString(Date date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(Globals.dateFormatString_javaUtil);
		return (dateFormat.format(date));
	}
	
	public enum TimeUnits {
		MILLISECONDS("ms"),
		SECONDS("ss"),
		UNKNOWN("xx");
		
		String code;
		TimeUnits(String code) {
			this.code=code;
		}
		
		public static TimeUnits getTimeUnit(String code) {
			
			TimeUnits[] tus = TimeUnits.values();  
			for(int t = 0; t < tus.length; t++) {
				if(code.equalsIgnoreCase(tus[t].code))
					return tus[t];
			}
			return UNKNOWN;
		}
	}
	
	
	
}
