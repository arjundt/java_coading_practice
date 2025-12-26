package com.example.stream.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Payment record class
record Payment(String paymentMode) { }

public class PaymentModeFrequency {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Payment> pay = new ArrayList<>();
		pay.add(new Payment("cheque"));
		pay.add(new Payment("upi"));
		pay.add(new Payment("upi"));
		pay.add(new Payment("upi"));
		pay.add(new Payment("cheque"));
		pay.add(new Payment("card"));
		pay.add(new Payment("card"));

		String string = pay.stream().map(Payment::paymentMode)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElseThrow();
		System.out.println("collect " + string);
	}
}