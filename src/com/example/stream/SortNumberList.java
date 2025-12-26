package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

//Sort a list of integers in descending order.
public class SortNumberList {

	public static void main(String[] args) {
		ArrayList<Integer> collect = Arrays.asList(3, 5, 1, 4, 2)
				.stream().sorted(Comparator.reverseOrder())
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(collect);
	}

}
