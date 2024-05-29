package com.jdbc;

import java.sql.Connection;
import java.util.Scanner;

//import com.dao.LibraryManagmentOperation;
//import com.pojo.LibraryManagementPojo;

public class LibraryMain {

	public static void main(String[] args) {
		
		
//Connection con = LibraryManagementPojo.getconnection();
		Connection con = LibraryManagmentPojo.getconnection();
		
		LibraryManagmentOperation lib = new LibraryManagmentOperation();
		
		Scanner sc = new Scanner(System.in);
		  String s=" "; do {
		  System.out.println("1.Insert\n2.Update\n3.Delete\n4.Display\n5.Search");
		  System.out.println("----*****-----Enter Your Choice-----*****-----");
		  int c = sc.nextInt();
		  switch(c)
		  {
		  case 1: 
			  lib.insertData(con);
			  
			  break;
		  case 2:
			  lib.updateData();
			  break;
		  case 3:
			  lib.deleteRecord(con);
			  break;
		  case 4:
			  lib.displayDate(con);
			  break;
		  case 5:
			  lib.search(con);
			  default:
				  System.out.println("----*****Enter Your Choise----*****");
		  }
		  System.out.println("to continue Y/N");
		  s=sc.next();
		  
		  }while(s.equalsIgnoreCase("Y"));
		 

	}

}
