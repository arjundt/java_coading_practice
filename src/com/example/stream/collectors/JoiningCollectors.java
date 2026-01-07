package com.example.stream.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningCollectors {

	public static void main(String[] args) {
		List<String> words = List.of("Java", "Stream", "API");
		String collectString = words.stream().collect(Collectors.joining(", "));
		System.out.println(collectString);
	}
}