package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Java 8 program to perform cube on list elements and filter numbers greater than 50.
public class MapAndFilter {
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
		List<Integer> mapAndFilter = integerList.stream()
				.map(i -> i * i * i)
				.filter(i -> i>50)
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(mapAndFilter);
	}
}
