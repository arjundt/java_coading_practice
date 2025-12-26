package com.example.stream.list;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseIntArray {

	public static void main(String[] args) {
//		Reverse an integer array
        int[] intArr = new int[] {5, 1, 7, 3, 9, 6};

//        Integer[] reversedArr = Arrays.asList(intArr).reversed().toArray(Integer[]::new);
//        System.out.println(Arrays.toString(reversedArr));
        
        int[] reverseArr2 = IntStream.rangeClosed(1, intArr.length).map(i -> intArr[intArr.length - i]).toArray();
        System.out.println(Arrays.toString(reverseArr2));
	}
}