package com.practice;

public class TwoDArrrays {

	public static void main(String[] args) {
		
		/*
		 * int n = 3; // Size of the square matrix int[][] matrix = new int[n][n];
		 * 
		 * // Fill the diagonal with increasing numbers for (int i = 0; i < n; i++) {
		 * matrix[i][i] = i + 1; }
		 * 
		 * // Print the matrix for (int i = 0; i < n; i++) { for (int j = 0; j < n; j++)
		 * { System.out.print(matrix[i][j] + " "); } System.out.println(); }
		 */
		int a[][]={{1,2,3},{4,5,6},{7,8,9}};
		
		
		   for(int i=0;i<3;i++) {
			   for(int j=0;j<3;j++) {
				   if(i==j) {
				   System.out.print(a[i][j]);
			       }else{
				   System.out.print(" ");
			   }
		   }
			   System.out.println();
			
		}

	}

}
