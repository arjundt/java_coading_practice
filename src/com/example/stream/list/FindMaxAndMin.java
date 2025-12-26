package com.example.stream.list;

import java.util.Arrays;
import java.util.List;

public class FindMaxAndMin {

	public static void main(String[] args) {
		//Given a list of integers, find maximum and minimum of those numbers
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        
        List<Integer> sortedList = listOfIntegers.stream().sorted().toList();
        
        System.out.println(sortedList.getFirst());
        System.out.println(sortedList.getLast());
	}
}