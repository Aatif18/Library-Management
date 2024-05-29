package com.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter the element : ");
		
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=1;i<a.length-1;i++)
		{
			if(a[i]>a[i-1] && a[i]>a[i+1])
			{
				System.out.println(a[i]);
			}
		}
		
		

	}

}
