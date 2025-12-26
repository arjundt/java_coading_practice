package com.example.stream.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89, 89);
        listOfIntegers.sort(Comparator.reverseOrder());
        System.out.println(listOfIntegers.get(1));
        
        Integer integer = listOfIntegers.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println(integer);
        
	}

}
