package com.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {
		longestString();
		frequencyOfCharactersInString();
		parallelStreamToComputeSum();
	}
	
	private static void parallelStreamToComputeSum(){
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}

	 private static void longestString() {
		 List<String> words = Arrays.asList("Java", "Stream", "API", "Development");
		 String maxInt = words.stream().max(Comparator.comparingInt(String::length)).orElse(null);
		 System.out.println(maxInt);
	 }

//	 Count the frequency of each character in a string.
	 private static void frequencyOfCharactersInString() {
		 String input = "success";
		 Map<Character, Long> collect = input.chars()
		 	.mapToObj(c->(char)c)
		 	.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 System.out.println(collect);
	 }
}
