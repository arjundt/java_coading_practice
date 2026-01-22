package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 3, 5);
		List<Integer> uniqueNums = numbers.stream()
				.collect(Collectors.toSet())
				.stream().toList();
		System.out.println(uniqueNums);
	}
}