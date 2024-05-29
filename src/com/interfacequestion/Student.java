package com.interfacequestion;

public class Student implements Comparable<Student> {
	  private int marks;

	  public Student(int marks) {
	      this.marks = marks;
	  }

	  public int getMarks() {
	      return marks;
	  }

	  @Override
	  public int compareTo(Student other) {
	      if (this.marks > other.marks) {
	          return 1; 
	      } else if (this.marks < other.marks) {
	          return -1; 
	      } else {
	          return 0; 
	      }
	  }
	}
 
	
	


