package com.example.stream;

import java.util.Arrays;
import java.util.List;

//Count strings starting with a specific prefix, e.g., “A”.
public class StringStartWithPrefix {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
		long count = names.stream().filter(s -> s.startsWith("A")).count();
		System.out.println(count);
	}
}
