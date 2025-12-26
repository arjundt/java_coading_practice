package com.example.stack;

import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

public class ValidParentheses {

	public static void main(String[] args) {
		String s = "()";
		String[] strArr = s.split("");
		List<String> list = Stream.of(strArr).toList();
		Stack<String> stack = new Stack<>();
		stack.addAll(list);
		
		System.out.println(stack);
	}

}
