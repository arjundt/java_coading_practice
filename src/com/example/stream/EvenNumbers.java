package com.example.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

//https://medium.com/@asishpanda444/stream-api-coding-qna-8df8682b7e2a
public class EvenNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> evenNumList = Arrays.asList(1,2,3,4,5,6,7,8,9).stream().filter(n -> n%2==0)
//		.toList();
		.collect(Collectors.toCollection(ArrayList::new));
		System.out.println(evenNumList);
	}
}
