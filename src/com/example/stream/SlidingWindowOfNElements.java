package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Create a sliding window of size 3 for a list of integers.
public class SlidingWindowOfNElements {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
//		System.out.println(numbers.size());
		List<List<Integer>> slidingWindows = IntStream.range(0, numbers.size() - 2)
		    .mapToObj(i -> numbers.subList(i, i + 3))
		    .collect(Collectors.toList());
		System.out.println(slidingWindows); // Output: [[1, 2, 3], [2, 3, 4], [3, 4, 5], [4, 5, 6]]
	}
}