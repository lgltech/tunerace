package com.lgl.tunerace.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {
	private Connection conn = null;
	public MySQL() {
		
	}
	public Connection fetchConnection() {
		if (conn != null) {
			return conn;
		} else {
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost/tunerace", "tunerace", "");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return conn;
		}
	}
	public void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		conn = null;
	}
	public Connection refetchConnection() {
		closeConnection();
		return fetchConnection();
	}
}
