package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByEvenOdd {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Map<Boolean, List<Integer>> numPartition = numbers.stream()
				.collect(Collectors.partitioningBy(n -> n%2 ==0));
		System.out.println(numPartition);
		
		System.out.println("==========================================================");
		
		Map<String, List<Integer>> numPartition2 = numbers.stream()
		        .collect(Collectors.groupingBy(
		                n -> n % 2 == 0 ? "even" : "odd"
		        ));
		System.out.println(numPartition2);
	}
}