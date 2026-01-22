package com.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NLargestElement {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 50, 40, 30);
		Integer ii = numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(ii);
		
		System.out.println("===============================================");
		
		Integer ii2 = numbers.stream().sorted((a,b)->b.compareTo(a)).skip(1).findFirst().get();
		System.out.println(ii2);
		
	}
}