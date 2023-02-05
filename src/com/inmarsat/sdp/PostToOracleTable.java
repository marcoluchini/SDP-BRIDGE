package com.inmarsat.sdp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.inmarsat.sdp.beans.AssetInfoBean;

/**
 * @author MarcoLuchini
 *
 */
public class PostToOracleTable {

	final static Logger logger = LoggerFactory.getLogger(PostToOracleTable.class);

	private static PostToOracleTable table = null;
	private PostToOracleTable() {
		
	}
	
	public static PostToOracleTable getTable() {
		if(table == null) 
			table = new PostToOracleTable();
		return table;
	}
	
	public boolean ProcessAsset(AssetInfoBean entry) {

		Connection conn = null;
		CallableStatement cstmt = null;
		String sql = "BEGIN process_asset(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?); END;";

		try {
			conn = DBConnectionFactory.getOracleConnection();

			cstmt = conn.prepareCall(sql);
			cstmt.setString("p_CREATIONDATE", entry.getCreationDate());
			cstmt.setString("p_DATETIME", entry.getDateTime());
			cstmt.setString("p_ICCID", entry.getIccid());
			cstmt.setString("p_IMSI", entry.getImsi());
			cstmt.setString("p_LEVEL1ID", entry.getLevel1Id());
			cstmt.setString("p_LEVEL1NAME", entry.getLevel1Name());
			cstmt.setString("p_MSISDN", entry.getMsisdn());
			cstmt.setString("p_PACKAGEPLAN", entry.getPackagePlan());
			cstmt.setString("p_KEY", entry.getProductInstanceAlternateKey());
			cstmt.setString("p_NAME", entry.getProductInstanceName());
			cstmt.setString("p_STATUS", entry.getProductInstanceStatus());
			cstmt.setString("p_RATEPLAN", entry.getRatePlan());

			cstmt.execute();

			return true;

		} catch (SQLException e) {
			logger.error("Couldn't complete update: {}", sql);
			logger.error(Utils.printSQLException(e));
			e.printStackTrace();
			return false;
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
}
