package com.example.stream.list;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

public class ReverseString {

	public static void main(String[] args) {
//		Reverse each word of a string using Java 8 streams?
        String str = "Java Concept Of The Day";
        StringCharacterIterator ss = new StringCharacterIterator(str);
        
        ss.setIndex(ss.getEndIndex());
        while(ss.current() != CharacterIterator.DONE) {
        	System.out.println("{} "+ ss.current());
        	ss.previous();
        	
        }
        
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());

	}

}
