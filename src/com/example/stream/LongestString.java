package com.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "API", "Development", "Aevelopment");
		
		String maxWord = words.stream()
				.max(Comparator.comparingInt(String::length)
						.thenComparing(str -> str.startsWith("A")))
				.get();
		System.out.println(maxWord);
		
		String longestWord = words.stream().reduce((w1, w2) -> w1.length()>w2.length() ? w1 : w2).get();
		System.out.println(longestWord);
	}
}