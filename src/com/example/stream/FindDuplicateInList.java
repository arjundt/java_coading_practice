package com.example.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Identify all duplicate elements in a list
public class FindDuplicateInList {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6);
		Set<Integer> duplicates = numbers.stream()
			.filter(n -> Collections.frequency(numbers, n) > 1)
			.collect(Collectors.toSet());
		System.out.println(duplicates);

		
		Set<Integer> unique = new HashSet<>();
		duplicates = numbers.stream()
				.filter(n -> !unique.add(n))
				.collect(Collectors.toCollection(HashSet::new));
		System.out.println(duplicates);
	}
}