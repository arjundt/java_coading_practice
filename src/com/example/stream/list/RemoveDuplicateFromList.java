package com.example.stream.list;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		
		listOfStrings.stream().distinct().forEach(System.out::println);
	}
}
