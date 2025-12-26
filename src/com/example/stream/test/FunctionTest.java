package com.example.stream.test;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;

public class FunctionTest {

	public static void main(String[] args) {
		Function<Integer, Integer> fun = x -> x * 2;
		System.out.println(fun.apply(3));
		
		IntUnaryOperator inn = IntUnaryOperator.identity();
		System.out.println(inn.applyAsInt(12));

	}
}