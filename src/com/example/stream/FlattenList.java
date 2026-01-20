package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
		
		ArrayList<Integer> singleList = listOfLists.stream()
				.flatMap(lst -> lst.stream())
				.collect(Collectors.toCollection(ArrayList::new));
		singleList.forEach(System.out::println);
	}
}