package com.example.stream.list;

import java.util.Map;
import java.util.stream.Collectors;

public class CountOccourence {

	public static void main(String[] args) {
		String str = "abcdabd";
		Map<Character, Long> charCount = str.chars() // returns an IntStream
	            .mapToObj(c -> (char) c) // convert int to Character
	            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(charCount);
	}

}
