package com.example.stream.list;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergerUnsortedArray {

	public static void main(String[] args) {
//		How do you merge two unsorted arrays into single sorted array using Java 8 streams
		int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5};
        
        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println(Arrays.toString(c));
        
        //How do you merge two unsorted arrays into single sorted array without duplicates
        int[] a1 = new int[] {4, 2, 5, 1};
        int[] b2 = new int[] {8, 1, 9, 5};
        int[] c2 = IntStream.concat(Arrays.stream(a1), Arrays.stream(b2)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(c2));
	}
}