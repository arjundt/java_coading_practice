package com.example.recursion;

public class FabonaaciSeries {
	
    public static long fibonacciNumber(int n){
    	System.out.println("n is "+n);
        if(n == 0) {
        	System.out.println("n is 0");
        	 return 0;
        } else if(n == 1 || n == 2) {
        	System.out.println("n is 1 or 2");
            return 1;
        }
        return fibonacciNumber(n-1) + fibonacciNumber(n-2);
    }

	public static void main(String[] args) {
		System.out.println(fibonacciNumber(50));
	}

}
