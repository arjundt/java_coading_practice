package com.example.string;

import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Arjun";
		System.out.println(reverseStringUsingBackwardTraversal(str));
		System.out.println(reverseStringUsingTwoPointerApproch(str));
		System.out.println(reverseStringUsingRecursion(str));
		System.out.println(reverseStringUsingStack(str));
		System.out.println(new StringBuilder(str).reverse());
	}
	
	private static String reverseStringUsingStack(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i <= str.length()-1; i++) {
			stack.push(str.charAt(i));
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= str.length()-1; i++) {
			sb.append(stack.pop());
		}
		
		return sb.toString();
	}

	private static String reverseStringUsingRecursion(String s) {
		char[] ch = s.toCharArray();
		reverseString(ch, 0, ch.length-1);
		
		return new String(ch);
	}
		
	private static void reverseString(char[] ch, int left, int right) {
		while(left >= right)
			return;
		
		char temp = ch[left];
		ch[left] = ch[right];
		ch[right] = temp;		
	}

	private static String reverseStringUsingTwoPointerApproch(String s) {
		int start = 0;
		int end = s.length() - 1;
		
		StringBuilder sb = new StringBuilder(s);
	        
		 while(start<end){
			 char temp = sb.charAt(start);
			 sb.setCharAt(start, sb.charAt(end));
			 sb.setCharAt(end, temp);
			
		     start++;
		     end--;
		 }
		
		return sb.toString();
	}
	private static String reverseStringUsingBackwardTraversal(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = str.length()-1; i >= 0; i--) {
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}

}
