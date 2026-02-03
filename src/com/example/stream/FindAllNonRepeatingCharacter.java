package com.example.stream;

import java.util.List;

public class FindAllNonRepeatingCharacter {

	public static void main(String[] args) {
		String input = "swiss";
		List<Character> chars = input.chars().mapToObj(c -> (char)c)
			.filter(c -> input.chars().filter(ch -> ch == c).count() == 1)
			.toList();
		System.out.println(chars);
	}
}