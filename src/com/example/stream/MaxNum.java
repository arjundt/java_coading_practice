package com.example.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class MaxNum {

	public static void main(String[] args) {
		int maxNum = Arrays.asList(10, 20, 30, 40, 50).stream().max(Integer::compare).orElse(0);
		System.out.println(maxNum);
		
		int maxPrimitiveNum = Arrays.stream(new int[]{1,2,3,4,5}).max().getAsInt();
		System.out.println(maxPrimitiveNum);
	}

}
