package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class StringContainsString {
//	Check if any string in a list contains “API”.
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Java", "Stream API", "Lambda");
		boolean anyMatch = strings.stream().anyMatch(s -> s.contains("API"));
		System.out.println(anyMatch);
		
	}
}