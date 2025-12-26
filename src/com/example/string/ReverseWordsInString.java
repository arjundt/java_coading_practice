package com.example.string;

import java.util.Stack;

public class ReverseWordsInString {

	public static void main(String[] args) {
//		String s = "i.like.this.program.very.much";
		String s = "..geeks..for.geeks.";
		System.out.println(reverseWords(s));
		System.out.println(reverseWords2(s));
	}
	
	public static String reverseWords2(String s) {
        // Convert the string to a char array 
        // for in-place operations
        char[] chars = s.toCharArray();
        int n = chars.length;

        // Reverse the entire string
        reverse(chars, 0, n - 1);

        int i = 0;
        for (int l = 0; l < n; ++l) {
            if (chars[l] != '.') {

                // Add a dot between words if needed
                if (i != 0)
                	chars[i++] = '.';

                // Find the end of the word
                int r = l;
                while (r < n && chars[r] != '.')
                	chars[i++] = chars[r++];

                // Reverse the current word
                reverse(chars, i - (r - l), i);

                // Move to next word
                l = r;
            }
        }

        return new String(chars, 0, i);
    }

    // Utility to reverse part of the char array
    private static void reverse(char[] arr, int left, int right) {
        right--;  
        while (left < right) {
            char temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
    }
	
	

	private static String reverseWords(String s) {
		Stack<String> stk = new Stack<>();
		StringBuilder word = new StringBuilder();
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != '.') {
				word.append(s.charAt(i));
			}
			else if(word.length() > 0) {
				stk.push(word.toString());
				word.setLength(0);
			}
		}
		if(word.length() > 0) {
			stk.push(word.toString());
			word.setLength(0);
		}
		
		StringBuilder result = new StringBuilder();
		while(!stk.isEmpty()) {
			result.append(stk.pop());
			if(!stk.isEmpty())
				result.append(".");
		}
		return result.toString();
	}

}
