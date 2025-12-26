package com.example.stream;

import java.util.Arrays;
import java.util.List;

//Given a list of lists, flatten it into a single list
public class FlattenList {

	public static void main(String[] args) {
		List<List<Integer>> listOfLists = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5),
			    Arrays.asList(6, 7, 8, 9)
			);
		List<Integer> flatList = listOfLists.stream().flatMap(List::stream).toList();
		System.out.println(flatList);
	}
}