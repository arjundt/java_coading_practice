package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "API");
		Map<String, Integer> map = words.stream()
				.collect(Collectors.toMap(Function.identity(), String::length));
		map.forEach((k, v)-> System.out.println(k + ": " + v));
		
		System.out.println("======================================================");
		
		for(Entry<String, Integer> mm : map.entrySet()) {
			String key = mm.getKey();
			Integer value = mm.getValue();
			System.out.println(key + ": " + value);
		}

	}

}
