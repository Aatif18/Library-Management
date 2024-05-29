package com.collectionpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeDemoMain {

	public static void main(String[] args) {
		
		List<EmployeeDemo> employee = new ArrayList<>();
		
		employee.add(new EmployeeDemo(10,"Aatif",74109787));
		employee.add(new EmployeeDemo(11,"Aman",55809787));
		employee.add(new EmployeeDemo(12,"Ataf",71409787));
		employee.add(new EmployeeDemo(13,"Arshad",85009787));
		employee.add(new EmployeeDemo(14,"Aasir",78009787));
		
		
		System.out.println("Employee before Sorting :");
		
		System.out.println(employee);
		
		Comparator<EmployeeDemo> c = Comparator.comparing(EmployeeDemo::getName);
		Collections.sort(employee,c);
		
		System.out.println("\nEmployee after sorting by name :");
		employee.forEach(System.out::println);
		
	}

}
