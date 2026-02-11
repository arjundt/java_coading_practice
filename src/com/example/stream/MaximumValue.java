package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class MaximumValue {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		Integer max1 = myList.stream().max((o1, o2) -> o1.compareTo(o2)).get();
		System.out.println(max1);
		
		myList.stream().max(Integer::compareTo).ifPresent(System.out::println);
	}
}