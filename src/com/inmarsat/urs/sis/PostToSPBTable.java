package com.inmarsat.urs.sis;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.inmarsat.urs.sis.beans.UTInfoBean;

/**
 * @author MarcoLuchini
 *
 */
public class PostToSPBTable {

	final static Logger logger = LoggerFactory.getLogger(PostToSPBTable.class);

	private static PostToSPBTable table = null;
	private PostToSPBTable() {
		
	}
	
	public static PostToSPBTable getTable() {
		if(table == null) 
			table = new PostToSPBTable();
		return table;
	}
	
	public boolean Invoke_PLE(UTInfoBean entry) {

		Connection conn = null;
		CallableStatement cstmt = null;
		String sql = "BEGIN urs_ple(?, ?, ?, ?, ?, ?, ?, ?, ?); END;";
		// accessNetwork, id, SAC, LATITUDE, LONGITUDE, UNIXDATE, BEAM, SATELLITE, SENT

		try {
			conn = DBConnectionFactory.getFRExitConnection();

			cstmt = conn.prepareCall(sql);
			cstmt.setInt("p_ACCESSNETWORK", entry.getAccessnetwork());
			cstmt.setLong("p_ID", entry.getImsi());
			cstmt.setLong("p_UNIXDATE", entry.getCapture());
			cstmt.setLong("p_SAC", entry.getSac());
			cstmt.setDouble("p_LATITUDE", entry.getLatitude());
			cstmt.setDouble("p_LONGITUDE", entry.getLongitude());
			cstmt.setLong("p_BEAM", entry.getBeamid());
			cstmt.setString("p_SATELLITE", entry.getSatelliteid());
//			cstmt.setString(5, FREUtils.stringToTbcd(entry.getImsiAsString()));
			cstmt.registerOutParameter("SEND", Types.VARCHAR);

			cstmt.execute();

			if (cstmt.getString("SEND").equals("Y")) {
				return true;
			} else {
				return false;
			}

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

	
	public boolean Post(UTInfoBean currUTInfo) {
		Connection conn = null;
//		String sql = "INSERT INTO UT_INFO(ID, SAC, LATITUDE, LONGITUDE, UNIXDATE, BEAM, SATELLITE) VALUES (?, ?, ?, ?, ?, ?, ?)";
		String sql = "INSERT INTO UT_INFO(ID, SAC, LATITUDE, LONGITUDE, UNIXDATE, BEAM, SATELLITE) VALUES (?, ?, ?, ?, ?, ?, ?)"
				+ " LOG ERRORS INTO UT_INFO_INSERT_ERRORS REJECT LIMIT UNLIMITED";
		
		try {	
			conn = DBConnectionFactory.getFRExitConnection();
			// Disable auto-commit as recommended for batch operations
			conn.setAutoCommit(false);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			logger.debug(sql);
			// accessNetwork, ID, SAC, LATITUDE, LONGITUDE, UNIXDATE, BEAM, SATELLITE


			int currentBatchSize = 0;
			if (currUTInfo.getAccessnetwork() == Globals.accessNetBGAN) {
				currentBatchSize = GPSRecordConsumer.BGAN_batch_size;
			} else if (currUTInfo.getAccessnetwork() == Globals.accessNetGX) {
				currentBatchSize = GPSRecordConsumer.GX_batch_size;
			}	
			logger.debug("Current network is:" + currUTInfo.getAccessnetwork() + " and batch size: " + currentBatchSize);
			
			for (int i=0; i<currentBatchSize; i++) {
				if (currUTInfo.getAccessnetwork() == Globals.accessNetBGAN) {
					logger.debug("Current BGAN List size is:" + GPSRecordConsumer.BGAN_message.size());
					logger.debug("Processing record:" + (GPSRecordConsumer.BGAN_batch_size - i -1) );			
					currUTInfo = GPSRecordConsumer.BGAN_message.remove(GPSRecordConsumer.BGAN_batch_size - i -1);
					logger.debug("After processing BGAN List size is:" + GPSRecordConsumer.BGAN_message.size());
				} else {
					logger.debug("Current GX List size is:" + GPSRecordConsumer.GX_message.size());
					logger.debug("Processing record:" + (GPSRecordConsumer.GX_batch_size - i -1) );			
					currUTInfo = GPSRecordConsumer.GX_message.remove(GPSRecordConsumer.GX_batch_size - i -1);
					logger.debug("After processing GX List size is:" + GPSRecordConsumer.GX_message.size());

				}

				logger.debug("Insert is: " + currUTInfo.getImsiAsString() + " "+ currUTInfo.getCapture().toString());				
				pstmt.setLong(1, currUTInfo.getImsi());
				pstmt.setInt(2, currUTInfo.getSac());
				pstmt.setDouble(3, currUTInfo.getLatitude());
				pstmt.setDouble(4, currUTInfo.getLongitude());
				pstmt.setLong(5, currUTInfo.getCapture());
				pstmt.setInt(6, currUTInfo.getBeamid());
				pstmt.setString(7, currUTInfo.getSatelliteid());
				pstmt.addBatch();
			}
			int[] updateCounts = pstmt.executeBatch();			
			conn.commit();
			pstmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		
		return true;
	}

	
}
