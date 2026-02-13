package com.example.string;

import java.util.ArrayList;

public class FizzBuzz {

	public static void main(String[] args) {
		int n = 20;
        ArrayList<String> res = fizzBuzz(n);
        for (String s : res) {
            System.out.print(s + " ");
        }
        System.out.println("");
        
        ArrayList<String> res1 = fizzBuzzAdvanced(n);
        for (String s : res1) {
            System.out.print(s + " ");
        }
	}
	
	static ArrayList<String> fizzBuzzAdvanced(int n) {
        ArrayList<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String s = ""; 

            if (i % 3 == 0) s += "Fizz";
            if (i % 5 == 0) s += "Buzz";
            if (s.isEmpty()) s += i;
			
            res.add(s);
        }
        return res;
    }

	static ArrayList<String> fizzBuzz(int n){
        ArrayList<String> res = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                res.add("Fizz");
            }
            else if (i % 5 == 0) {
                res.add("Buzz");
            }
            else {
                res.add(Integer.toString(i));
            }
        }
        return res;
    }
}
