package com.example.company;

import java.util.Arrays;

public class ZeroRightShifter {
	public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(arr1));
        moveZerosToRight(arr1);
        System.out.println(Arrays.toString(arr1));
	}
	private static void moveZerosToRight(int[] arr) {
		int insertPos = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				arr[insertPos] = arr[i];
				insertPos++;
			}
		}
		while(insertPos < arr.length) {
			arr[insertPos] = 0;
			insertPos++;
		}
	}
}