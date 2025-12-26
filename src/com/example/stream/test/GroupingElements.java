package com.example.stream.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingElements {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Arjun", "Yash", "Pranjali", "Ajinkya", "Ashish", "Sneh", "Swati");
		Map<Integer, List<String>> collect = names.stream().collect(Collectors.groupingBy(s -> s.length()));
		System.out.println(collect);

		Map<Integer, String> collect1 = names.stream()
				.collect(Collectors.groupingBy(s -> s.length(), Collectors.joining(" ,")));
		System.out.println(collect1);

		Map<Object, Long> collect2 = names.stream()
				.collect(Collectors.groupingBy(s -> s.length(), TreeMap::new, Collectors.counting()));
		System.out.println(collect2);
		System.out.println(collect2 instanceof TreeMap);

		// partitioning
		Map<Boolean, List<String>> collect3 = names.stream()
				.collect(Collectors.partitioningBy(str -> str.length() > 4));
		System.out.println(collect3);

		// Mapping
		List<String> collect4 = names.stream().collect(Collectors.mapping(String::toUpperCase, Collectors.toList()));
		System.out.println(collect4);

		// Counting word occurrences
		String str = "hello world java hello hello world";
		Map<String, Long> countWordFreq = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(countWordFreq);

		// Partioning Even and odd numbers
		Map<Boolean, List<Integer>> partionEvenOdd = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).collect(Collectors.partitioningBy(x -> x % 2 == 0));
		System.out.println(partionEvenOdd);
		
		//Summing values in a map
		Map<String, Integer> items = new HashMap<>();
		items.put("apple", 20);
		items.put("banana", 30);
		items.put("grapes", 10);
		
		System.out.println(items.values().stream().reduce(Integer::sum));
		System.out.println(items.values().stream().mapToInt(x->x).sum());
		System.out.println(items.values().stream().collect(Collectors.summingInt(Integer::intValue)));
		
		
		//Create a map from stream elements
		Map<String, Integer> mapp= Stream.of("apple", "banana", "grapes").collect(Collectors.toMap(Function.identity(), String::length));
		System.out.println(mapp);

	}

}
