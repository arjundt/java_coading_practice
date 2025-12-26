package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberStartWith1 {
//	Given a list of integers, find out all the numbers starting with 1 using Stream functions
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

		List<Integer> collect = myList
				.stream()
				.map(String::valueOf).filter(s -> s.startsWith("1"))
				.collect(Collectors.mapping(Integer::valueOf, Collectors.toList()));
		System.out.println(collect);
		
		/* When numbers are given as Array  */
		int[] arr = {10,15,8,49,25,98,32};
		List<Integer> collect2 = Arrays.stream(arr)
			.boxed()
			.filter(s -> s.toString().startsWith("1"))
			.collect(Collectors.mapping(Integer::valueOf, Collectors.toList()));
		System.out.println(collect2);

	}

}
