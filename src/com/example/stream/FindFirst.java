package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		var firstInt = myList.stream().findFirst().get();
		System.out.println(firstInt);
	}
}