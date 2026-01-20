package com.example.stream;

import java.util.Arrays;
import java.util.List;

//Calculate the sum of all numbers in a list.
public class SumOfNumbers {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);

		Integer sum1 = numbers.stream().reduce((a,b) -> a+b).get();
		System.out.println(sum1);
	}
}