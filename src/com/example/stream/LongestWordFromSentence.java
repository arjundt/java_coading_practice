package com.example.stream;

import java.util.Arrays;
import java.util.Comparator;

//Find the longest word in a sentence using Streams
public class LongestWordFromSentence {
	public static void main(String[] args) {
		String sentence = "Java Stream API is very powerful";
		String[] arr = sentence.split(" ");

		String longestWord = Arrays.stream(arr)
				.max(Comparator.comparingInt(String::length))
				.orElseThrow();
		System.out.println(longestWord);
	}
}