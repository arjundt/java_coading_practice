package com.example.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Count Frequency of Characters in a String
public class CharactersFrequency {

	public static void main(String[] args) {
		String word = "success";
		Map<Character, Long> map = word.chars().mapToObj(s -> (char)s)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
		List<Integer> numbers = Arrays.asList(4, 5, 6, 5, 4, 3);
		List<Integer> sortedByFrequency = numbers.stream()
		    .sorted(Comparator.comparingInt(n -> -Collections.frequency(numbers, n)))
		    .distinct()
		    .collect(Collectors.toList());
		System.out.println(sortedByFrequency); // Output: [4, 5, 6, 3]
	}
}