package com.example.stream.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TerminalOpTest {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		intList.stream().skip(1).toList();
		intList.stream().skip(1).collect(Collectors.toCollection(ArrayList::new));

		intList.stream().forEach(System.out::println);

		intList.stream().mapToInt(Integer::intValue).sum();
		Integer collect = intList.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println("sum: " + collect);

		List<String> strList = Arrays.asList("Pune", "Mumbai", "Delhi", "Ahemadabad", "Gwalio");
		List<String> collect1 = strList.stream()
				.sorted((o1, o2) -> o1.length() - o2.length())
				.toList();
		System.out.println("Sort by length: " +collect1);

		List<String> collect2 = strList.stream()
				.sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
				.collect(Collectors.toList());
		System.out.println("Sort by length then alphabetical: " +collect2);
	}

}
