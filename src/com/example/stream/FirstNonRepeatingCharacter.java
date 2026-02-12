package com.example.stream;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//find the first not repeating character in string swiss
public class FirstNonRepeatingCharacter {

//	public static void main(String[] args) {
//		String str = "swiss";
//		String outtt = Stream.of(str.split(""))
//		.collect(Collectors.groupingBy(c -> c, Collectors.counting()))
//		.entrySet().stream()
//		.filter(e->e.getValue()==1).map(Map.Entry::getKey).findFirst().get();
//		System.out.println(outtt);
//		
//	}
	
	public static void main(String[] args) {
		String input = "swiss";
		Character first = input.chars().mapToObj(c -> (char) c)
		.filter(c-> input.indexOf(c) == input.lastIndexOf(c))
		.findFirst().get();
		System.out.println(first);
		
		int asInt = input.chars()
				.filter(c -> input.indexOf(c)==input.lastIndexOf(c))
				.findFirst().getAsInt();
		System.out.println(asInt);
		System.out.println(Character.toString(asInt));
		
		
		String str = "Salars";  //l

        Character firstNonRepeating = str.toLowerCase().chars()
        		.mapToObj(c -> (char)c)
        		.collect(Collectors.groupingBy(Function.identity(), 
        				LinkedHashMap::new, Collectors.counting()))
        		.entrySet().stream().filter(e -> e.getValue() == 1)
        		.map(e -> e.getKey())
        		.findFirst()
        		.orElse('#');
        System.out.println(firstNonRepeating);
        
        Character firstRepeating = str.toLowerCase().chars()
        		.mapToObj(c -> (char)c)
        		.collect(Collectors.groupingBy(Function.identity(), 
        				LinkedHashMap::new, Collectors.counting()))
        		.entrySet().stream()
        		.filter(e -> e.getValue() > 1)
        		.map(e -> e.getKey())
        		.findFirst()
        		.orElse('#');
        System.out.println(firstRepeating);
        
	}
}