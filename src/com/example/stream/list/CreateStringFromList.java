package com.example.stream.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreateStringFromList {

	public static void main(String[] args) {
		//Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(String str : listOfStrings) {
        	sb.append(str);
        	sb.append(", ");
        }
        sb.append("]");
        System.out.println(sb.toString());
        
        //using stream
        String collect = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));
        System.out.println(collect);
	}
}