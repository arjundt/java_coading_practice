package com.example.stream;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//	Given a map, filter entries with values greater than 10 and collect keys into a list.
public class FilterAndConvertMapToList {
	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("A", 5, "B", 15, "C", 10, "D", 20);
		List<String> keyList = map.entrySet().stream()
			.filter(entry -> entry.getValue()>10)
			.map(Map.Entry::getKey)
			.toList();
		System.out.println(keyList);
		
		List<String> keyList1 = map.entrySet().stream()
				.filter(entry -> entry.getValue()>10)
				.map(Entry::getKey)
				.toList();
			System.out.println(keyList1);
			
		List<String> keyList2 = map.entrySet().stream()
				.filter(entry -> entry.getValue()>10)
				.map(entry -> entry.getKey())
				.toList();
			System.out.println(keyList2);
	}
}