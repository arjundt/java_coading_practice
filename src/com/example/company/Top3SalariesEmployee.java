package com.example.company;

import java.util.Comparator;
import java.util.List;

public class Top3SalariesEmployee {
	private record Employee(String name, double salary) {}

	public static void main(String[] args) {
		List<Employee> employees = List.of(new Employee("Ram", 1000.1),
				new Employee("Shyam", 1000.5),
				new Employee("Mohan", 2000.3),
				new Employee("Raman", 2500.1),
				new Employee("Ramesh", 1200.3));
		List<Employee> list = employees.stream()
				.sorted(Comparator.comparingDouble(Employee::salary).reversed())
				.limit(3)
				.toList();
		System.out.println(list);
	}
}