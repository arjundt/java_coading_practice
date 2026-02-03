package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Detect all anagrams in a list of strings.
class DetectAnagrams {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("listen", "silent", "enlist", "google", "elbow", "below");
		Map<String, List<String>> collect = words.stream()
		.collect(Collectors.groupingBy(word -> word.chars().sorted()
				.mapToObj(c -> String.valueOf((char)c))
				.collect(Collectors.joining())
				));
		System.out.println(collect);
	}
}