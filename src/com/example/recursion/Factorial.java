package com.example.recursion;

public class Factorial {
	public static long findFactorial(int num) {
		if(num <= 1) {
			return 1;
		}
		return num * findFactorial(num - 1);
	}
	public static void main(String[] args) {
		long factorial = findFactorial(12);
		System.out.println(factorial);
	}
}