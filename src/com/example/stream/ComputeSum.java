package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ComputeSum {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().reduce(0, (a, b) -> a+b);
		System.out.println(sum);
		
		int sum2 = numbers.parallelStream().mapToInt(a -> a.intValue()).sum();
		System.out.println(sum2);
		
		int[] numArr = new int[] {1, 2, 3, 4, 5}; 
		
		int sum3 = Arrays.stream(numArr).sum();
		System.out.println(sum3);
		
		int sum4 = Stream.of(numArr).flatMapToInt(Arrays::stream).sum();
		System.out.println(sum4);
	}
}