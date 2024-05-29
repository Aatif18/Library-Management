package com.containmentquestion;

import java.util.Scanner;

public class StudentDepartmentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("*****-----------Enter the NAMES------------*****");
		
		Department dept = new Department();
		
		Student stud = new Student();
		
		dept.setDid(101);
		dept.setDname("Computer ");
		stud.setRollno(18);
		stud.setSname("M AATIF");
		stud.setDept(dept);
		
		System.out.println(stud);
		
		

	}

}
