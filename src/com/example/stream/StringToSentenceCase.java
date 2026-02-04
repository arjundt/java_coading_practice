package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Convert a list of strings to sentence case
public class StringToSentenceCase {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("java", "stream", "api");
		List<String> sentenceCase = words.stream()
		    .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase())
		    .collect(Collectors.toList());
		System.out.println(sentenceCase); // Output: [Java, Stream, Api]
	}
}