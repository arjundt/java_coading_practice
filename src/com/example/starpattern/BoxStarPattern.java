package com.example.starpattern;

public class BoxStarPattern {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=0; j<=5; j++){
				if(i>1 && i<5) {
					if(j==0 || j==5)
						System.out.print("*");
					else
						System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
	}
}
