package com.inmarsat.urs.sis;

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
		pds.setURL(Globals.connectionURL);
		pds.setUser(Globals.user);
		pds.setPassword(Globals.passwd);
		pds.setInitialPoolSize(Globals.DBConnectionInitialPoolSize);
		pds.setMinPoolSize(Globals.DBConnectionInitialPoolSize);
		pds.setMaxPoolSize(Globals.DBConnectionMaxPoolSize);
		
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
