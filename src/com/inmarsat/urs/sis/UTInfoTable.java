package com.inmarsat.urs.sis;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.inmarsat.urs.sis.beans.UTInfoBean;

public class UTInfoTable {

	final static Logger logger = LoggerFactory.getLogger(UTInfoTable.class);

	private static UTInfoTable table = null;
	private UTInfoTable() {

	}
	
	public static UTInfoTable getTable() {
		if(table == null)
			table = new UTInfoTable();
		return table;
	}
	
//	@SuppressWarnings("resource")
	public boolean containsImsi(Long imsi) {
				
		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		//String sql = "SELECT IMSI FROM UT_INFO WHERE IMSI = " + imsi.toString();
		String sql = "SELECT IMSI FROM UT_INFO WHERE IMSI = ?";
		try {
			conn = DBConnectionFactory.getFRExitConnection();
			// stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, imsi.toString());
			rset = pstmt.executeQuery();

			Long dbimsi = null;
			while (rset.next()) {
				dbimsi = rset.getLong(1);
				if (imsi.equals(dbimsi)) {
					return true;
				}
			}
			return false;

		} catch (SQLException sqlEx) {
			logger.error("Couldn't complete update: {}", sql);
			logger.error(Utils.printSQLException(sqlEx));
			return false;
		} catch (Exception ex) {

			logger.error("Couldn't complete update: {}", sql);
			logger.error("Stack Trace: {}",
					Utils.getStackString(ex.getStackTrace()));
			return false;

		} finally {
			try {
				DBUtils.close(rset);
				DBUtils.close(pstmt);
				DBUtils.close(conn);
			} catch (Exception conEX) {
				logger.error("Couldn't close db connection.");
				logger.error(Utils.getStackString(conEX.getStackTrace()));
			}
		}
	}
	
	public boolean containsImsi(UTInfoBean entry) {
		return containsImsi(entry.getImsi());
	}

	public int validateData(UTInfoBean entry) {

		Connection conn = null;
		CallableStatement cstmt = null;
		String sql = "BEGIN validateData(?, ?, ?, ?, ?); END;";
		
		try {
			conn = DBConnectionFactory.getFRExitConnection();

			cstmt = conn.prepareCall(sql);
			cstmt.setLong(1, entry.getImsi());
			cstmt.setLong(2, entry.getCapture());
			cstmt.setDouble(3, entry.getLatitude());
			cstmt.setDouble(4, entry.getLongitude());
			cstmt.setString(5, Utils.stringToTbcd(entry.getImsiAsString()));
	
			cstmt.execute();
			
			return 1;
			
		} catch (SQLException e) {
			logger.error("Couldn't complete update: {}", sql);
			logger.error(Utils.printSQLException(e));
			e.printStackTrace();
			return 0;
		} finally {
			try {
				DBUtils.close(cstmt);
				DBUtils.close(conn);
			} catch (Exception conEX) {
				logger.error("Couldn't close db connection.");
				logger.error(Utils.getStackString(conEX.getStackTrace()));
			}
		}
		
}
	
	public UTInfoBean selectByImsi(String imsiAsString) {

		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
//		String sql = "SELECT IMSI, SAC, STATUS, LAST_MODIFIED FROM UT_INFO WHERE IMSI="
//				+ imsiAsString;

		String sql = "SELECT IMSI, SAC, STATUS, LAST_MODIFIED FROM UT_INFO WHERE IMSI= ?";

		try {
			conn = DBConnectionFactory.getFRExitConnection();
			// stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, imsiAsString);
			rset = pstmt.executeQuery();
			if (rset.next()) {
				UTInfoBean bean = new UTInfoBean(rset.getLong(1),
						rset.getInt(2));
				bean.setStatus(rset.getInt(3));
				bean.setDate(rset.getDate(4));
				return bean;
			}
			else {
				logger.error("UTInfo for imsi({}) not found, returned null.", imsiAsString);
				return null;
			}

		} catch (SQLException sqlEx) {
			logger.error("Couldn't complete update: {}", sql);
			logger.error(Utils.printSQLException(sqlEx));
			return null;
		} catch (Exception ex) {

			logger.error("Couldn't complete update: {}", sql);
			logger.error("Stack Trace: {}",
					Utils.getStackString(ex.getStackTrace()));
			return null;

		} finally {
			try {
				DBUtils.close(rset);
				DBUtils.close(pstmt);
				DBUtils.close(conn);
			} catch (Exception conEX) {
				logger.error("Couldn't close db connection.");
				logger.error(Utils.getStackString(conEX.getStackTrace()));
			}
		}
	}

	public boolean updateSacOnImsi(UTInfoBean entry) {

		String sql = "UPDATE UT_INFO SET " 
					+ "SAC = " + entry.getSacAsString()
					+ ", LAST_MODIFIED = " + entry.getDateAsSQLDateString() 
					+ ", LATITUDE = " + Double.toString((entry.getLatitude()))
					+ ", LONGITUDE = " + Double.toString(entry.getLongitude())
					+ " WHERE IMSI=" + entry.getImsiAsString();

		return executeUpdateSql(sql);
	}

	public boolean insert(UTInfoBean entry) {

		String sql = "INSERT INTO UT_INFO(IMSI, SAC, STATUS, LAST_MODIFIED, LATITUDE, LONGITUDE)"
				+ " VALUES(" + entry.getImsiAsString() 
				+ ", " + entry.getSacAsString() 
				+ ", " + entry.getStatusAsString()
				+ ", " + entry.getDateAsSQLDateString() 
				+ ", " + Double.toString(entry.getLatitude())
				+ ", " + Double.toString(entry.getLongitude()) 
				+ ")";
		// String sql = "INSERT INTO UT_INFO(IMSI, SAC, STATUS, LAST_MODIFIED)"
		// + " VALUES(?,?,?,?)";
		return executeUpdateSql(sql);
	}

	public boolean deleteOnImsi(UTInfoBean utInfoBeanNew) {
		String sql = "delete from ut_info where imsi="
				+ utInfoBeanNew.getImsiAsString();
		return executeUpdateSql(sql);
	}

	private boolean executeUpdateSql(String sql) {
		return DBUtils.executeUpdateSql(sql, logger);
	}

}
