//n nautral nums in an unsorted array. find missing nums. range 1 to n+1
package com.example.numbers;

import java.util.Arrays;

public class FindMissingNumbers {

	public static void main(String[] args) {
		int n = 4; 
		int[] arr = new int[] {1, 4, 2 , 5};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		findMissing(arr[0], arr[n-1]);
	}
	
	private static void findMissing(int first, int last) {
		if(last-1 == first)
			return;
		findMissing(first, last-1);
		
	}
}
