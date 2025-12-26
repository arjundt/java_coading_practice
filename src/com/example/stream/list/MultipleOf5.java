package com.example.stream.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleOf5 {

	public static void main(String[] args) {
		//From the given list of integers, print the numbers which are multiples of 5
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		List<Integer> collect = listOfIntegers.stream().filter(num -> num%5 == 0).collect(Collectors.toList());
		System.out.println(collect);
	}

}
