package com.example.string;

public class PalindromeNumber {
	public static boolean isPalindromeUsingTwoPointerApproch(String s) {
		int start = 0;
		int end = s.length() - 1;
	        
		while (start < end) {
			if (s.charAt(start) != s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	
	public static boolean isPalindromeUsingOptimizedTwoPointerApproch(String s) {
		int len = s.length();
        for(int i=0; i<=len/2; i++){
            if(s.charAt(i) != s.charAt(len - 1 - i)){
                return false;
            }
        }
        return true;
	}
	
	public static boolean isPalindromeUsingRecursion(String s) {
		int start = 0;
		int end = s.length() - 1;
	        
		return isPalindrome(s, start, end);
	}
	
	private static boolean isPalindrome(String s, int start, int end) {
		while(start >= end)
			return true;
		
		if(s.charAt(start) != s.charAt(end)){
	         return false;
	     }
		return isPalindrome(s, start+1, end-1);
	}

	public static void main(String[] args) {
		String str = "abba";
		System.out.println(str + ": " + isPalindromeUsingTwoPointerApproch(str));
		System.out.println(str + ": " + isPalindromeUsingOptimizedTwoPointerApproch(str));
		System.out.println(str + ": " + isPalindromeUsingRecursion(str));
	}
}
