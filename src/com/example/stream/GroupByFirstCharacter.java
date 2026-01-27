package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstCharacter {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "avocado", "blueberry", "cherry");
		Map<Character, List<String>> collect = words.stream()
				.collect(Collectors.groupingBy(n -> n.charAt(0), Collectors.toList()));
		System.out.println("collect is " + collect);

	}
}
