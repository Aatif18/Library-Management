package com.interfacequestion;



public class InheritanceDemo {
	
	
	int id;
	String name;
	
		void display()
		{
			System.out.println("Employee ID :"+id);
			System.out.println("Employee Name :"+name);
		}

		@Override
		public String toString() {
			return "InheritanceDemo [id=" + id + ", name=" + name + "]";
		}
	}/*
		 * public class Employee1 extends InheritanceDemo{
		 * 
		 * String address; public Employee1(int id, String name,String address) {
		 * super(id, name); this.address=address;
		 * 
		 * } void show() { super.display();
		 * System.out.println("Employee Address :"+address); }
		 * 
		 * }
		 */


