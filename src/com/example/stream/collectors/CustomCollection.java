package com.example.stream.collectors;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class CustomCollection {

	public static void main(String[] args) {
		var nameSet = Arrays.stream(new String[]{"John", "Sarah", "Mark", "Sarah", "Eric"})
		.collect(Collectors.toCollection(HashSet::new));

		nameSet.forEach(System.out::println);
	}
}