package com.containmentquestion;

public class Student {
	
	private int rollno;
	private String sname;
	Department dept;

	/*
	 * public Student(int rollno, String sname, Department dept) { super();
	 * this.rollno = rollno; this.sname = sname; this.dept = dept; }
	 */
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", dept=" + dept + "]";
	}
	


	

}
