package com.example.stream.primitives;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RoundDoubleValues {

	public static void main(String[] args) {
		double[] doArr = new double[] {1.2, 3.45, 4.78};
		
		System.out.println(Arrays.stream(doArr).boxed().map(Math::round).toList());
		
	}
}