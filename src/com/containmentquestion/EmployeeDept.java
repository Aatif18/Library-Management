package com.containmentquestion;

public class EmployeeDept {
	
	 int id;
	 String name;
	 int salary;
	 DeptEmployee e;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public DeptEmployee getE() {
		return e;
	}
	public void setE(DeptEmployee e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "EmployeeDept [id=" + id + ", name=" + name + ", salary=" + salary + ", e=" + e + "]";
	}
	
	

}
