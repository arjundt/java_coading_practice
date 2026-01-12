package com.example.stream.collectors;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectingAndThen {
	public static void main(String[] args) {
		List<String> names = List.of("John", "Sarah", "Mark");
		Optional<String> concatenatedNames = names.stream()
		    .collect(Collectors.collectingAndThen(Collectors.joining(", "), Optional::of));
		System.out.println(concatenatedNames.get());
	}
}