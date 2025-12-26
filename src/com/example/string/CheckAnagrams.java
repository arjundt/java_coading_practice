package com.example.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Check if two Strings are Anagrams of each other
public class CheckAnagrams {

	public static void main(String[] args) {
		String s1 = "geeks";
        String s2 = "kseegs";
        
        System.out.println(checkAnagramsUsingSorting(s1, s2));
        System.out.println(checkAnagramsUsingHashMap(s1, s2));
        System.out.println(checkAnagramsUsingArrays(s1, s2));
        
        String[] strArr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strArr));
        
	}
	
	private static boolean checkAnagramsUsingArrays(String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		
		int[] freq = new int[26];
		for(int i=0; i<s1.length(); i++) {
			freq[s1.charAt(i) -'a']++;
		}
		
		for(int i=0; i<s2.length(); i++) {
			freq[s2.charAt(i) -'a']--;
		}
		
		for(int count : freq) {
			if(count != 0)
				return false;
		}
		
		return true;
	}

	private static boolean checkAnagramsUsingHashMap(String s1, String s2) {
		
		if(s1.length() != s2.length())
			return false;

		Map<Character, Integer> map = new HashMap<>();
		for (Character ch : s1.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		for(Character ch : s2.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) - 1);			
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() != 0)
				return false;
		}		
		return true;
	}

	private static boolean checkAnagramsUsingSorting(String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {

	    Map<String, List<String>> map = new HashMap<>();

	    for (String str : strs) {
	        int[] freq = new int[26];

	        for (char c : str.toCharArray()) {
	            freq[c - 'a']++;
	        }

	        // Build unique key from frequency array
	        StringBuilder key = new StringBuilder();
	        for (int count : freq) {
	            key.append('#').append(count);
	        }
	        System.out.println(key);
	        map.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(str);
	    }

	    return new ArrayList<>(map.values());
	}

}