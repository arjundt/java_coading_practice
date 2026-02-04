package com.example.stream;

import java.util.List;
import java.util.Map;

//Convert a map to a list of “key=value” strings
public class ConverMapToList {
	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("A", 1, "B", 2, "C", 3);
		List<String> maptoList= map.entrySet().stream()
			.map(e -> e.getKey() + "=" + e.getValue())
			.toList();
		System.out.println(maptoList);
	}
}