package com.example.company;

import java.util.Arrays;

public class SecondHighestNum {

	public static void main(String[] args) {
		int[] arr= {1, 6, 4, 5};
		int len = arr.length;
//		System.out.println(len);
		int[] sortedArr = bubbleSort(arr);
		System.out.println(sortedArr[len - 2]);
		
		sortUsingStream(arr);
	}
	private static int[] bubbleSort(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			int temp;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	private static void sortUsingStream(int[] arr) {
		Integer integer = Arrays.stream(arr)
				.boxed().distinct()
				.sorted((a, b) -> Integer.compare(b, a))
				.skip(1).findFirst().get();
		System.out.println(integer);
	}

}
