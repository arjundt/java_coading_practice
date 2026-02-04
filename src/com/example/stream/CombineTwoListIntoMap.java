package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Combine two lists into a map where one is keys and the other values
public class CombineTwoListIntoMap {
	public static void main(String[] args) {
		List<String> keys = Arrays.asList("A", "B", "C");
		List<Integer> values = Arrays.asList(1, 2, 3);
		Map<String, Integer> map = IntStream.range(0, keys.size())
		    .boxed()
		    .collect(Collectors.toMap(keys::get, values::get));

		System.out.println(map); // Output: {A=1, B=2, C=3}
	}
}