package com.containmentquestion;

public class Employee {
	
	private int id;
	private String name;
	private int salary;
	Dept d;
	MyDate my;
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
	public Dept getD() {
		return d;
	}
	public void setD(Dept d) {
		this.d = d;
	}
	public MyDate getMy() {
		return my;
	}
	public void setMy(MyDate my) {
		this.my = my;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", d=" + d + ", my=" + my + "]";
	}
	
	

}
