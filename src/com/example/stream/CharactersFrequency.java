package com.example.stream;

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
	}
}