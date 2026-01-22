package com.example.stream;

import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentCharacter {
//	Find the most frequent character in a string
	public static void main(String[] args) {
		String input = "success";
		Character mostFrequestChar = input.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream()
				.max(Entry.comparingByValue()).orElseThrow().getKey();
		System.out.println(mostFrequestChar);
		
	}
}