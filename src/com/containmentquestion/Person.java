package com.containmentquestion;

public class Person {
	
	private String name;
	private String gender;
	private int age;
	Address a;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getA() {
		return a;
	}
	public void setA(Address a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Address [name=" + name + ", gender=" + gender + ", age=" + age + ", a=" + a + "]";
	}

}
