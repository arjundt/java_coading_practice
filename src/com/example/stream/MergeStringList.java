package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MergeStringList {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Stream", "API", "is", "powerful");
		String finalStr = words.stream().collect(Collectors.joining(" "));
		System.out.println(finalStr);
		
		String finalStr2 = words.stream().reduce("", (a,b) -> a + " " + b).trim();
		System.out.println(finalStr2);
	}
}