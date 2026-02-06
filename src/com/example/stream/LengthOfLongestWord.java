package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Use Stream API to find the length of the longest name in the list
public class LengthOfLongestWord {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
		Map<String, Integer> collect = names.stream()
				.collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(collect);
	}
}