package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LibraryManagmentOperation {
	
Statement stmt;
	
	Scanner sc = new Scanner(System.in);
	
	public void displayDate(Connection conn)
	{
		try {
			 stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from student");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3));
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void insertData(Connection conn)
	{
		try {
			//stmt=conn.createStatement();
			//int i=stmt.executeUpdate("insert into student values(?,?,?)");
			String sql = "insert into student values(?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter ID , NAME , DEPERTMENT");
			
			int sid = sc.nextInt();
			String name = sc.next();
			String dept = sc.next();
			
			pst.setInt(1, sid);
			pst.setString(2, name);
			pst.setString(3, dept);
			int i = pst.executeUpdate();
			if(i!=0)
			{
				System.out.println("Inserted Successfully !!!!");
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public void updateData()
	{
		System.out.println("Enter ID");
		int id = sc.nextInt();
		System.out.println("Enter what you have to update:(Name/Dept)");
		String udata=sc.next();
		if(udata.equalsIgnoreCase("name"))
		{
			System.out.println("Enter the name");
			String i1=sc.next();
			
			try {
				int i=stmt.executeUpdate("Update student set sname='"+i1+"' where sid="+id);
				if(i!=0)
				{
					System.out.println("Record Update Sucessfully !!!!");
				}
			}catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
	public void deleteRecord(Connection conn)
	{
		System.out.println("Enter id to Delete Records !!!!");
		int id=sc.nextInt();
		try {
			stmt=conn.createStatement();
			stmt.executeUpdate("delete from student where sid="+id);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	public void search(Connection conn)
	{
		System.out.println("Enter the Student_id");
		int id = sc.nextInt();
		try {
			stmt=conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student where sid="+id);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getString(3));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
