package com.example.stream.list;

import java.util.Arrays;
import java.util.List;

public class SortDecimalDescending {

	public static void main(String[] args) {
		//sort the given list of decimals in reverse order
		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		decimalList.sort((a,b) -> a.compareTo(b));
		System.out.println(decimalList.reversed());
	}
}