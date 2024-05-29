package com.interfacequestion;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student(95);
		Student s2 = new Student(48);
		
		int comresult = s1.compareTo(s2);
		
		
		
		if(comresult>0)
		{
			System.out.println("High");
		}else if(comresult<0)
		{
			System.out.println("less");
		}else {
			System.out.println("Equal");
		}
		
		

}

}
