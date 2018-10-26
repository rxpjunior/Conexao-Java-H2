package com.rxpjunior;

import java.sql.Connection;
import java.sql.Statement;

public class Crud {
	public void criaBD() {
		Connection conn = null;
		conn = Conexao.abreConexo();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql = "CREATE TABLE   REGISTRATION " + "(id INTEGER not NULL, " + " first VARCHAR(255), "
					+ " last VARCHAR(255), " + " age INTEGER, " + " PRIMARY KEY ( id ))";
			stmt.executeUpdate(sql);
			System.out.println("Tabela criada...");
			stmt.close();
		} catch (Exception e) {
			System.out.println("Erro para criar a tabela");
		}
	}

	public void insert() {
		Connection conn = null;
		conn = Conexao.abreConexo();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql = "INSERT INTO Registration " + "VALUES (100, 'Zara', 'Ali', 18)";
			stmt.executeUpdate(sql);
			System.out.println("Dados inseridos na base de dados...");
			sql = "INSERT INTO Registration " + "VALUES (200, 'Zira', 'Eli', 20)";
			stmt.executeUpdate(sql);
			System.out.println("Dados inseridos na base de dados...");
			sql = "INSERT INTO Registration " + "VALUES (300, 'Zera', 'Oli', 32)";
			stmt.executeUpdate(sql);
			System.out.println("Dados inseridos na base de dados...");
			stmt.close();
		} catch (Exception e) {
			System.out.println("Erro de inserção de dados");
		}
	}
	
	public void apagaBD() {
		Connection conn = null;
		conn = Conexao.abreConexo();
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql = "DROP TABLE REGISTRATION";
			stmt.executeUpdate(sql);
			System.out.println("Tabela apagada...");
			stmt.close();
		} catch (Exception e) {
			System.out.println("Erro para apagar a tabela");
		}
	}

}
