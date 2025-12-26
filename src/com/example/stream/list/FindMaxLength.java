package com.example.stream.list;

import java.util.Arrays;
import java.util.List;

public class FindMaxLength {

	public static void main(String[] args) {
		
//		Use Stream API to find the length of the longest name in the list
		List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
		// Integer integer = names.stream().max(Comparator.comparing(String::length)).get().length();
		// System.out.println("integer "+integer);
		Integer result = names.stream().map(e -> e.length()).max((integer, newInteger) -> integer.compareTo(newInteger))
				.get();
		System.out.println("result is " + result);

//        Use Stream API to count the total number of distinct words (case-insensitive) in all the sentences
		List<String> sentences = Arrays.asList(
				"Java Stream API provides a fluent interface for processing sequences of elements.",
				"It supports functional-style operations on streams of elements, such as map-reduce transformations.",
				"In this exercise, you need to count the total number of words in all sentences.");
		long count = sentences.stream().flatMap(e -> Arrays.stream(e.split(" "))).distinct().count();
		System.out.println(count);

		// Use Stream API to find the concatenation of the first two words that have even lengths.
		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
		String ss = words.stream().filter(str -> str.length() % 2 == 0).limit(2)
//    		  .collect(Collectors.joining());
				.reduce((a, b) -> a + b).get();
		System.out.println("Join first two even length string: " + ss);

		// Use Stream API to find the sum of the squares of even numbers in the list.
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum = numbers.stream().filter(e -> e % 2 == 0).mapToInt(e -> e * e).sum();
		System.out.println("sum of the squares of even numbers in the list: " + sum);

	}
}