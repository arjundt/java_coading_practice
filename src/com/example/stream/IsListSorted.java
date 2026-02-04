package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//Verify if a list is sorted in ascending order
public class IsListSorted {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7);
		boolean isSorted = IntStream.range(0, numbers.size() - 1)
			.allMatch(i -> numbers.get(i) <= numbers.get(i + 1));
		System.out.println(isSorted);
	}
}