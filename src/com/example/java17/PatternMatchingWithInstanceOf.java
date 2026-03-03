package com.example.java17;

public class PatternMatchingWithInstanceOf {
	public static void main(String[] args) {
		var ss = "Arjun";
		if(ss instanceof String str) {
			System.out.println("String is: " + str);
		}
	}
}