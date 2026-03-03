package com.example.java17;

public class PatternMatchingWithSwitch {
	public static void main(String[] args) {
		Object obj = "Arjun";
		switch (obj) {
	        case Character c -> System.out.println("Character: " + c.charValue());
	        case Integer i -> System.out.println("Integer: " + i);
	        case String s -> System.out.println("String, length " + s.length());
	        case null -> System.out.println("null value");
	        default -> System.out.println("Other");
	    }
	}
}