package com.containmentquestion;

import java.util.Scanner;

public class EmpdeptMain {

	public static void main(String[] args) {
		
		EmployeeDept[] ed = new EmployeeDept[2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<ed.length;i++)
		{
			System.out.println("--------Enter Employee ID , NAME , SALARY----------- ");
			
			int id=sc.nextInt();
			String name=sc.next();
			int salary=sc.nextInt();
			
			//DeptEmployee d1[] = new DeptEmployee[1];
			
			
				System.out.println("---------Enter DEPT ID , NAME ------------");
				int d_id=sc.nextInt();
				String d_name=sc.next();
				
				DeptEmployee d = new DeptEmployee();
				d.setD_id(d_id);
				d.setD_name(d_name);
				
				//d1[j]=d;
				
			
			EmployeeDept em = new EmployeeDept();
			em.setId(id);
			em.setName(name);
			em.setSalary(salary);
		    em.setE(d);
		
			ed[i]=em;
		}
		
		for(EmployeeDept z:ed)
		{
			System.out.println(z);
		}
	}

}
