package com.basepackage.utility;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseConnection {
	public Connection buildConnection() {
		Connection con = null;
		try {
			
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\Shrijeet\\eclipse-workspace\\Assignment1\\file\\employee_data.txt");
			Properties p = new Properties();
			p.load(fis);
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/internity", "root", "root");

			System.out.println("connection built :" + con);
			//System.out.println(String.format("getCatalog() returns: %s",con.getCatalog()));
		} catch (Exception e) {
			System.out.println("Connection failed !!!!!");
		}
		
		
		
		return con;

	}

}
