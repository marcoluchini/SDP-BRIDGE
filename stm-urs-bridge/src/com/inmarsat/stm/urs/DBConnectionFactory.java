package com.inmarsat.stm.urs;

import java.sql.Connection;
import java.sql.SQLException;

import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;

public class DBConnectionFactory {

	PoolDataSource pds = null;
	Connection conn = null;
	static DBConnectionFactory dbConnFactory = null;
	
	private DBConnectionFactory() throws SQLException  {

		pds = PoolDataSourceFactory.getPoolDataSource();
		pds.setConnectionFactoryClassName("oracle.jdbc.pool.OracleDataSource");
		pds.setURL(STMConstants.connectionURL);
		pds.setUser(STMConstants.user);
		pds.setPassword(STMConstants.passwd);
		pds.setInitialPoolSize(STMConstants.DBConnectionInitialPoolSize);
		pds.setMinPoolSize(STMConstants.DBConnectionInitialPoolSize);
		pds.setMaxPoolSize(STMConstants.DBConnectionMaxPoolSize);
		
	}
	
	private Connection getConn() throws SQLException {
		return pds.getConnection();	
	}

	public static Connection getFRExitConnection() throws SQLException {
		
		if(dbConnFactory == null)
			dbConnFactory = new DBConnectionFactory();
		return dbConnFactory.getConn();
	}
	
}
