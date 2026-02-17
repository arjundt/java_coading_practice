package com.example.stream;

import java.util.List;
import java.util.stream.Collectors;

//use map to convert object into Uppercase in Java 8
public class ListToUppercase {
	public static void main(String[] args) {
		List<String> list = List.of("aa", "bb", "cc", "dd");
		List<String> upperCaseStrings = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseStrings);
	}
}