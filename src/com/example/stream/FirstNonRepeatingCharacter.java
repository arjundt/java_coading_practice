package com.example.stream;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//find the first not repeating character in string swiss
public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {
		System.out.println("FirstNonRepeatingCharacter");
		String input = "swiss";
		Character first = input.chars().mapToObj(c -> (char) c)
		.filter(c-> input.indexOf(c) == input.lastIndexOf(c))
		.findFirst().orElse('#');
		System.out.println(first);
		
		int asInt = input.chars()
			.filter(c -> input.indexOf(c)==input.lastIndexOf(c))
			.findFirst().getAsInt();
		System.out.println(Character.toString(asInt));
		
		String outt = Stream.of(input.split(""))
			.collect(Collectors.groupingBy(c -> c, Collectors.counting()))
			.entrySet().stream()
			.filter(e->e.getValue()==1)
			.map(Map.Entry::getKey)
			.findFirst().get();
		System.out.println(outt);
		
        Character firstNonRepeating = input.toLowerCase().chars()
        		.mapToObj(c -> (char)c)
        		.collect(Collectors.groupingBy(Function.identity(), 
        				LinkedHashMap::new, Collectors.counting()))
        		.entrySet().stream().filter(e -> e.getValue() == 1)
        		.map(e -> e.getKey())
        		.findFirst()
        		.orElse('#');
        System.out.println(firstNonRepeating);
        
        System.out.println("FirstRepeatingCharacter");
        String firstRepeated = Stream.of(input.split(""))
	        .filter(s -> input.indexOf(s) != input.lastIndexOf(s))
	        .findFirst()
	        .get();
        System.out.println(firstRepeated);
        
        //Find first repeating character
        Character firstRepeating = input.toLowerCase().chars()
        		.mapToObj(c -> (char)c)
        		.collect(Collectors.groupingBy(Function.identity(), 
        				LinkedHashMap::new, Collectors.counting()))
        		.entrySet().stream()
        		.filter(e -> e.getValue() > 1)
        		.map(Entry::getKey)
        		.findFirst()
        		.orElse('#');
        System.out.println(firstRepeating);
	}
}