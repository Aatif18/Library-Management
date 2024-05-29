package com.containmentquestion;

public class EmpDeptMyDateMian {

	public static void main(String[] args) {
		
		//Employee emp = new Employee();
		
		Dept d = new Dept();
		
		MyDate md = new MyDate();
		
		Employee emp = new Employee();
		
		md.setDay("Monday");
		md.setMonth("Nov");
		md.setYear(1996);
		
		d.setDept_id(111);
		d.setDept_name("HR");
		
		emp.setId(18);
		emp.setName("M.AATIF");
		emp.setSalary(48500);
		emp.setD(d);
		emp.setMy(md);
		
		System.out.println(emp);
		
	}

}
