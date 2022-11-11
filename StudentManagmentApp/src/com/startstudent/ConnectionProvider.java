package com.startstudent;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	static Connection con;
	public static Connection create() {
	try {
		Class.forName("com.mysql.jdbc.driver");
		String user = "root";
		String password = "root";
		String url ="http://localhost:3306/studentmanagment";
		con = DriverManager.getConnection(url,user,password);
	}catch (Exception e) {
		e.printStackTrace();
	}
	return con;
	}
}
