package com.containmentquestion;

import java.util.Scanner;

public class EmployeeArrayMain {

	public static void main(String[] args) {
		
		EmployeeArray e[] = new EmployeeArray[2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<e.length;i++)
		{
			System.out.println("*******--------ENTER THE EMPLOYEE ID , NAME , SALARY--------*****");
			
			int id=sc.nextInt();
			String name=sc.next();
			int salary=sc.nextInt();
			
			EmployeeArray e1 = new EmployeeArray();
			e1.setId(id);
			e1.setName(name);
			e1.setSalary(salary);
			
			e[i]=e1;
			
		}
		for(int i=0;i<e.length;i++)
		{
			if(e[i].getSalary()>=10000)
			System.out.println(e[i]);
		}
	}

}
