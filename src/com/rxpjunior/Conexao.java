package com.rxpjunior;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "org.h2.Driver";
	static final String DB_URL = "jdbc:h2:~/test";
	// Database credentials
	static final String USER = "sa";
	static final String PASS = "";
	public Connection abreConexo() {
		Connection conn = null;
		try {
			// STEP 1: Register JDBC driver
			Class.forName(JDBC_DRIVER);

			// STEP 2: Open a connection
			System.out.println("Conectando ao Banco...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			
		} catch (Exception se) {
			// Handle errors for JDBC
			se.printStackTrace();
		} 
		return conn;
	}
}