package com.example.stream.collectors;

import java.util.List;
import java.util.stream.Collectors;

public class ReducingCollectors {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
//		Stream.of(numbers).collect(Collectors.reducing(0, Integer::sum));
		int sum = numbers.stream().collect(Collectors.reducing(0, Integer::sum));
		System.out.println(sum);
	}
}