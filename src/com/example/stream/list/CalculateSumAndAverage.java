package com.example.stream.list;

import java.util.Arrays;

public class CalculateSumAndAverage {

	public static void main(String[] args) {
//		Given an integer array, find sum and average of all elements?
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

        System.out.println(Arrays.stream(a).sum());
        System.out.println(Arrays.stream(a).average().getAsDouble());
	}
}