package com.example.stream;

import java.util.Arrays;
import java.util.List;

//Question: Calculate the product of all numbers in a list using reduce.
public class CalculateProductOfNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Integer product = numbers.stream()
				.reduce(1, (a, b) -> a * b);
		System.out.println(product);
	}
}