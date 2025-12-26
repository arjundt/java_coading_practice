package com.example.stream;

import java.util.Arrays;

public class MaxNum {

	public static void main(String[] args) {
		int maxNum = Arrays.asList(10, 20, 30, 40, 50).stream().max(Integer::compare).orElse(0);
		System.out.println(maxNum);
	}

}
