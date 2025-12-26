package com.example.stream.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortInIncreasingOrder {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//	Given a list of strings, sort them according to increasing order of their length
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		Comparator<String> cc = (o1, o2) -> Integer.compare(o1.length(), o2.length());
		
		listOfStrings.sort(cc);
		
		System.out.println(listOfStrings);
	}
	

}
