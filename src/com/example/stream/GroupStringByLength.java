package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Group a list of strings based on their length
public class GroupStringByLength {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "API", "Code", "Fun");
//		Map<String, Long> collect = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(String::length));
		
		System.out.println(collect);
	}
}
