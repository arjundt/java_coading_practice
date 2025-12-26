package com.example.stream.list;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SunAllDigit {
//	Find sum of all digits of a number in Java 8?
	public static void main(String[] args) {
		int i = 15623;
		
		int[] intArr = String.valueOf(i)
				.chars() // Stream of characters (as int)
				.map(c -> c - '0') // Convert char digits to int
				.toArray();
		System.out.println(IntStream.of(intArr).sum());
		
		//Another approch
        Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sumOfDigits);
        
        //another approch
        int reduceSum = String.valueOf(i)
				.chars() // Stream of characters (as int)
				.map(c -> c - '0') // Convert char digits to int
				.reduce(0, Integer::sum);
		System.out.println(reduceSum);
	}

}
