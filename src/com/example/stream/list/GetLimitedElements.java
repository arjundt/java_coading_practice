package com.example.stream.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GetLimitedElements {
//	How do you get three maximum numbers and three minimum numbers from the given list of integers
	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		List<Integer> bottom3 = listOfIntegers.stream().sorted().limit(3).toList();
		System.out.println(bottom3);
		
		List<Integer> top3 = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
		System.out.println(top3);
	}

}
