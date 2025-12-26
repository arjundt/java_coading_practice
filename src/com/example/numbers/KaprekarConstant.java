package com.example.numbers;

import java.util.stream.IntStream;

public class KaprekarConstant {
	private Integer KAPREKARCONSTANT = 6174;
	
	private int convertToHighest(Integer num) {
		IntStream.of(num).sorted().forEach(System.out::println);
		return 12;
	}
	
//	private int convertToLowest(Integer num) {
//		
//	}
	
	public static void main(String[] args) {
		KaprekarConstant kk = new KaprekarConstant();
		kk.convertToHighest(123);
	}

}
