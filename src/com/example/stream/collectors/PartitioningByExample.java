package com.example.stream.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitioningByExample {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7);
		Map<Boolean, List<Integer>> partitionMap = numbers.stream().collect(Collectors.partitioningBy(i -> i%2==2));
		for(Map.Entry<Boolean, List<Integer>> entry : partitionMap.entrySet()) {
			
		}
	}

}
