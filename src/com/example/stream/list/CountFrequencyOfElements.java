package com.example.stream.list;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountFrequencyOfElements {

	public static void main(String[] args) {
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
		
		Map<String, Integer> countFrequency = new HashMap<>();
		for(String str: stationeryList) {
			countFrequency.compute(str, (key, value) -> value == null ? 1 : value + 1);
		}
		System.out.println(countFrequency.toString());
	}
}
