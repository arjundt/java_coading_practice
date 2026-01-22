package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PalindromeString {

	public static void main(String[] args) {
		Predicate<String> palindromePredicate= (str) -> {
			return str.equals(new StringBuilder(str).reverse().toString()) ? true : false;
		};
		
		List<String> words = Arrays.asList("radar", "level", "world", "java");
		List<String> palindromeWords = words.stream().filter(palindromePredicate).toList();
		System.out.println(palindromeWords);
		
		List<String> palindromeWords1 = words.stream()
				.filter((str) -> {
							return str.equals(new StringBuilder(str).reverse().toString()) ? true : false;
						})
				.toList();
		System.out.println(palindromeWords1);
		

	}
}