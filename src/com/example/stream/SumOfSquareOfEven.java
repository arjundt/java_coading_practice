package com.example.stream;

import java.util.Arrays;
import java.util.List;

//Calculate the sum of squares of all even numbers in a list
public class SumOfSquareOfEven {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		int sum = numbers.stream()
			.filter(num -> num % 2 == 0)
			.mapToInt(n -> n * n).sum();
		System.out.println(sum);
	}
}