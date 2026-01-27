package com.example.stream;

import java.util.Arrays;
import java.util.List;

//Find the median of a list of integers
public class FindMedian {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 1, 4, 2, 5, 6);
		int size = numbers.size();
		List<Integer> sorted = numbers.stream().sorted().toList();
		
		double median;
		if (size % 2 == 0) {
			median = (sorted.get(size / 2 - 1) + sorted.get(size / 2)) / 2.0;
		} else {
			median = sorted.get(size / 2);
		}
		System.out.println(median);
	}
}	