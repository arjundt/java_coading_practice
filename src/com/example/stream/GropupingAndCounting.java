package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//count each element/word from the String ArrayList in Java8
public class GropupingAndCounting {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
		Map<String, Long> grouping = names.stream()
				.collect(Collectors.groupingBy(
						Function.identity(), Collectors.counting()));
		System.out.println(grouping);
		
//		find only duplicate elements with its count from the String ArrayList in Java8
		Map<String, Long> onlyDuplicates = grouping.entrySet().stream()
				.filter(entry -> entry.getValue() > 1)
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(onlyDuplicates);
	}
}