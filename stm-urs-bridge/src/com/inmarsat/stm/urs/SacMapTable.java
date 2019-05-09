package com.inmarsat.stm.urs;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.inmarsat.stm.urs.beans.SacMapBean;


public class SacMapTable {

	final static Logger logger = LoggerFactory.getLogger(SacMapTable.class);
	

	
	private static SacMapTable table = null;
	private SacMapTable() {
		
	}
	
	public static SacMapTable getTable() {
		if(table == null)
			table = new SacMapTable();
		return table;
	}

	@SuppressWarnings("resource")
	public boolean containsSac(SacMapBean entry) {

		Connection conn = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		//String sql = "SELECT SAC FROM SAC_MAP WHERE SAC=" + entry.getSacAsString();
		String sql = "SELECT SAC FROM SAC_MAP WHERE SAC= ?";
		try {
			conn = DBConnectionFactory.getFRExitConnection();
//			stmt = conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, entry.getSacAsString());
			rset = pstmt.executeQuery();

			int sac = -1;
			while (rset.next()) {
				sac = rset.getInt(1); 
				if(sac == entry.getSac()) {
					return true;
				}
			}
			return false;

		} catch (SQLException sqlEx) {
			logger.error("Couldn't complete select: {}", sql);
			logger.error(STMUtils.printSQLException(sqlEx));
			return false;
		} catch (Exception ex) {

			logger.error("Couldn't complete select: {}", sql);
			logger.error("Stack Trace: {}",
			STMUtils.getStackString(ex.getStackTrace()));
			return false;

		} finally {
			try {
				DBUtils.close(rset);
				DBUtils.close(pstmt);
				DBUtils.close(conn);
			} catch (Exception conEX) {
				logger.error("Couldn't close db connection.");
				logger.error(STMUtils.getStackString(conEX.getStackTrace()));
			}
		}			
	}
	
}
