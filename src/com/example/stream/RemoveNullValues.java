package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveNullValues {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", null, "Stream", null, "API");
		List<String> notNullStrings = words.stream().filter(Objects::nonNull).toList();
		System.out.println(notNullStrings);
	}
}