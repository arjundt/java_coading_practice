package com.example.numbers;

import java.math.BigInteger;

public class PrimeNumber {

	public static void main(String[] args) {
		boolean probablePrime = BigInteger.valueOf(13).isProbablePrime(1);
		System.out.println(probablePrime);
	}

}
