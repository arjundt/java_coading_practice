package com.example.stream.list;

import java.util.stream.IntStream;

public class SumOfNumber {

	public static void main(String[] args) {
//		How do you find sum of first 10 natural numbers?
		System.out.println(IntStream.range(1, 11).sum());
	}
}