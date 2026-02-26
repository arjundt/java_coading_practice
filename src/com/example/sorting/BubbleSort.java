package com.example.sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {3, 2, 1};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0 + i; j < arr.length; j++) {
				int temp;
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}