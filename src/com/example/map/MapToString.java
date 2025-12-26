package com.example.map;

import java.util.HashMap;
import java.util.Map;

public class MapToString {

	public static void main(String[] args) {
		Map<String, String> wordsByKey = new HashMap<>();
		wordsByKey.put("1", "one");
		wordsByKey.put("2", "two");
		wordsByKey.put("3", "three");
		wordsByKey.put("4", "four");
		
		System.out.println(wordsByKey.toString());
	}

}
