package com.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Find the word with the most vowels in a list
public class WordWithMaxVowels {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("stream", "java", "programming", "awesome");
		String wordWithMostVowels = words.stream()
		    .max(Comparator.comparingInt(word -> (int) word.chars()
		    		.filter(c -> "aeiou".indexOf(c) != -1).count()))
		    .orElse(null);
		System.out.println(wordWithMostVowels); // Output: programming
	}
}