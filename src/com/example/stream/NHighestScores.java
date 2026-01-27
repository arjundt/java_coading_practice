package com.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student {
	String name;
	int score;

	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

public class NHighestScores {
	public static void main(String[] args) {
		List<Student> students = Arrays.asList(new Student("Alice", 85), new Student("Bob", 92),
				new Student("Charlie", 88), new Student("Dave", 78), new Student("Eve", 91));
		List<Student> toppers = students.stream()
				.sorted(Comparator.comparingInt((Student s) -> s.score).reversed())
				.limit(3)
				.toList();
		toppers.forEach(stu -> System.out.println(stu.name));
	}
}