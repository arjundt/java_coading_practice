package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "API");
		List<String> reversedWords = words.stream().map((str) -> new StringBuilder(str).reverse().toString()).toList();
		System.out.println(reversedWords);
	}
}