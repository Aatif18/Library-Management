package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LibraryManagmentPojo {
	
	public static String driver = "com.mysql.cj.jdbc.Driver";
	public static String url="jdbc:mysql://localhost:3306/librarymanagment";
	public static String username="root";
	public static String password="root";

	public static Connection getconnection()
	{
		Connection con=null;
		try {
			Class.forName(driver);
			
			System.out.println("Driver Loaded");
			
			 con = DriverManager.getConnection(url,username,password);
			 
			System.out.println("Connection Stablist");
			
		} catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}


}
