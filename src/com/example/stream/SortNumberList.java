package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Sort a list of integers in descending order.
public class SortNumberList {

	public static void main(String[] args) {
		ArrayList<Integer> collect = Arrays.asList(3, 5, 1, 4, 2)
				.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(collect);
		
		int[] arr = new int[]{10,15,8,49,25,98,98,32,15};
		List<Integer> listIncrement = Arrays.stream(arr)
			.boxed()
			.sorted(Comparator.reverseOrder())
			.toList();
		System.out.println(listIncrement);
		
		int[] sortedDesc = Arrays.stream(arr)
		        .map(i -> -i)
		        .sorted()
		        .map(i -> -i)
		        .toArray();
		System.out.println(Arrays.toString(sortedDesc));
	}
}
