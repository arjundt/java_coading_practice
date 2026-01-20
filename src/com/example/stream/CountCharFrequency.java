package com.example.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharFrequency {

	public static void main(String[] args) {
		String input = "success";
		Map<Character, Long> charFrequency= input.chars()
		.mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		charFrequency.forEach((key, value) -> System.out.println(key + ": " + value));
	}
}