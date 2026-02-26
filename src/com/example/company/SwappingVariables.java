package com.example.company;

//Swapping values of two variables without using third variable
public class SwappingVariables {
	public static void main(String[] args) {
		int a = 100;
		int b = 30;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println(a);
		System.out.println(b);
	}
}
