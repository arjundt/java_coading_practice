package com.example.stream;

import java.util.Arrays;
import java.util.List;

public class TotalElements {

	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
		long elementsCount = myList.stream().count();
		System.out.println(elementsCount);
		
		int[] arr = {10,15,8,49,25,98,98,32,15};
		long count = Arrays.stream(arr).boxed().count();
		System.out.println(count);
	}
}