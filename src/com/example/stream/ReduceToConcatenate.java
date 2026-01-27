package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class ReduceToConcatenate {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Stream", "API", "is", "awesome");
		String concatenatedStr = words.reversed().stream()
//				.map(n -> new StringBuilder(n).reverse().toString())
				.reduce((a,b)-> a + " "+ b)
				.orElseThrow();
		System.out.println(concatenatedStr);
		
		String concatenatedStr2 = words.stream()
				.reduce((a,b)-> b + " " + a)
				.orElseThrow();
		System.out.println(concatenatedStr2);
	}
}