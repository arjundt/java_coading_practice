package com.example.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Generate the first N numbers in the Fibonacci sequence
public class FibonacciSeries {
	public static void main(String[] args) {
		int n = 10;
		List<Integer> fibonacci = Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
		    .limit(n)
		    .map(arr -> arr[0])
		    .collect(Collectors.toList());
		System.out.println(fibonacci); // Output: [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]

	}

}
