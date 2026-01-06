package com.example.stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByExample {

	public static void main(String[] args) {
		List<String> names = List.of("John", "Sarah", "Mark", "Sarah", "Eric");
		Map<String, Long> nameCount = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		nameCount.forEach((key, value) -> System.out.println(key + ": "+ value));
		System.out.println("//////////////////////////////////////");
		
		for (Map.Entry<String, Long> entry : nameCount.entrySet()) {
			String key = entry.getKey();
			Long val = entry.getValue();
			System.out.println(key + ": "+ val);
		}
	}
}