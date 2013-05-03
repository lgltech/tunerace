package com.lgl.tunerace.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseAdapter {
	private MySQL adapter;
	private Connection conn;
	public DatabaseAdapter()  {
		adapter = new MySQL();
	}
	public void activate() {
		/*try {
			Class.forName("com.mysql.jdbc.Driver");
			//conn = MySQL.fetchConnection();
		} catch (ClassNotFoundException baddriver) {
			baddriver.printStackTrace();
		} catch (SQLException sql) {
			sql.printStackTrace();
		}*/
		
	}

}
