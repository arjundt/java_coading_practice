package com.example.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Identify duplicate elements in a list
public class IdentifyDuplicated {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicates = numbers.stream()
				.filter(num -> !unique.add(num))
				.collect(Collectors.toSet());
//				.collect(Collectors.toCollection(HashSet::new));
		System.out.println(duplicates);
	}

}
