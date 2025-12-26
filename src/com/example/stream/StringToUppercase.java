package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class StringToUppercase {

//	Convert all strings in a list to uppercase.
	public static void main(String[] args) {
		List<String> names = Arrays.asList("java", "stream", "api");
		List<String> namesUppercase = names.stream().map(String::toUpperCase).toList();
		System.out.println(namesUppercase);

	}
}