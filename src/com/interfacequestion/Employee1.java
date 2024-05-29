package com.interfacequestion;

public class Employee1 extends InheritanceDemo {
	
	String address;
	public Employee1(int id, String name,String address) {
		super();
		this.address=address;
		
	}
	void show()
	{
		System.out.println("Employee Address :"+address);
	}
	@Override
	public String toString() {
		return "Employee1 [address=" + address + "]";
	}
	

}
