package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//Compute the running sum of a list of integers
public class ComputeRunningSum {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> runningSumList = IntStream.range(0, numbers.size())
				.mapToObj(i -> numbers.subList(0, i + 1).stream()
						.mapToInt(Integer::intValue).sum()).toList();

		System.out.println(runningSumList);
		
		int[] runningSum = new int[numbers.size()];
		int length = runningSum.length;
		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum += numbers.get(i);
			runningSum[i] = sum; 
		}
		System.out.println(Arrays.toString(runningSum));	
	}
}