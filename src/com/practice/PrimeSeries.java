package com.practice;

public class PrimeSeries {
	
	 private static boolean isPrime(int n, int divisor) {
	        if (n <= 2) {
	            return (n == 2);
	        }
	        if (n % divisor == 0) {
	            return false;
	        }
	        if (divisor * divisor > n) {
	            return true;
	        }
	        return isPrime(n, divisor + 1);
	    }

	    // Function to print prime numbers recursively
	    private static void printPrimes(int start, int end) {
	        if (start <= end) {
	            if (isPrime(start, 2)) {
	                System.out.print(start + " ");
	            }
	            printPrimes(start + 1, end);
	        }
	    }

	    public static void main(String[] args) {
	        int start = 2;  // Starting point of prime series
	        int end = 50;   // Ending point of prime series

	        System.out.println("Prime numbers between " + start + " and " + end + ":");
	        printPrimes(start, end);
	    }

}
