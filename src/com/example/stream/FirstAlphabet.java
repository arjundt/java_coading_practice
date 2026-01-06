package com.example.stream;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class FirstAlphabet {
//	Program to print the first alphabet of the each word from a statement using java 8 stream
	public static void main(String[] args) {
		String statement = "This is my <oditas interview no 1"; //output: T i m o i n
		
		Arrays.stream(statement.split(" "))
        .map(word -> word.chars()
                         .filter(Character::isLetter)
                         .findFirst())
        .filter(OptionalInt::isPresent)
        .map(opt -> String.valueOf((char) opt.getAsInt()))
        .forEach(ch -> System.out.print(ch + " "));
/////////////////////////////////////////
		String result = Arrays.stream(statement.split(" "))
	                  .map(str -> str.replaceAll("[^A-Za-z]", "")) // clean word
	                  .filter(str -> !str.isEmpty())
	                  .map(str -> str.substring(0, 1))
	                  .collect(Collectors.joining(" "));
		System.out.println('\n' + result);
///////////////////////////////////////
		Arrays.stream(statement.split(" "))
        .map(word -> {
            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    return String.valueOf(c);
                }
            }
            return ""; // no alphabet in word
        })
        .filter(s -> !s.isEmpty())
        .forEach(ch -> System.out.print(ch + " "));
	}

}
