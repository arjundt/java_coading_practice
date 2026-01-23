package com.example.stream;

import java.util.Arrays;
import java.util.List;

//Skip the first 3 elements and limit the result to the next 2.
public class SkipAndLimit {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		List<Integer> limitedNumbers = numbers.stream().skip(3).limit(2).toList();
		System.out.println(limitedNumbers);
	}
}