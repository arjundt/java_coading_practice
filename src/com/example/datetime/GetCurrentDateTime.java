package com.example.datetime;

//How will you get the current date and time using Java 8 Date and Time API?
public class GetCurrentDateTime {
	public static void main(String[] args) {
		System.out.println("Current Local Date: " + java.time.LocalDate.now());
        System.out.println("Current Local Time: " + java.time.LocalTime.now());
        System.out.println("Current Local Date and Time: " + java.time.LocalDateTime.now());
	}
}
