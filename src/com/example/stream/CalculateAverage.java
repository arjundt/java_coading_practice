package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class CalculateAverage {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		Double average = numbers.stream().mapToInt(Integer::intValue).average().getAsDouble();
		System.out.println(average);
	}
}