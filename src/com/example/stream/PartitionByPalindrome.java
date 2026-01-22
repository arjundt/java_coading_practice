package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Partition strings into palindromes and non-palindromes.
public class PartitionByPalindrome {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("radar", "level", "java", "stream");
		
		Map<Boolean, List<String>> palindromePartition = words.stream()
		.collect(
				Collectors.partitioningBy(
						str -> str.equals(new StringBuilder(str).reverse().toString()))
				);
		System.out.println(palindromePartition);
	}
}
