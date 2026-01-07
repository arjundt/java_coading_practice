package com.example.stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsToMap {

	public static void main(String[] args) {
		List<String> names = List.of("John", "Sarah", "Mark", "Sarah", "Eric");
		Map<String, Integer> nameLengthMap = names.stream()
				.distinct()
				.collect(Collectors.toMap(Function.identity(), String::length));
		for(Map.Entry<String, Integer> map : nameLengthMap.entrySet()) {
			System.out.println(map.getKey() + ": " + map.getValue());
		}
	}
}