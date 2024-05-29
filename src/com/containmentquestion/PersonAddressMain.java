package com.containmentquestion;

public class PersonAddressMain {

	public static void main(String[] args) {
		
		Address a =  new Address();
		
		Person p = new Person();
		
		a.setCity("BALAGHAT");
		a.setState("MADHYA PRADESH");
		a.setCountry("INDIA");
		
		p.setAge(28);
		p.setName("M.AATIF");
		p.setGender("MALE");
		p.setA(a);
		
		System.out.println(p);

	}

}
