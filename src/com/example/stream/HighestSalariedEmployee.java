package com.example.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

//From a list of employees, find the highest-paid employee in each department.
public class HighestSalariedEmployee {
	record Employee(String name, String department, double salary) {}
	
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("Alice", "HR", 50000),
			    new Employee("Bob", "IT", 80000),
			    new Employee("Charlie", "IT", 75000),
			    new Employee("Dave", "HR", 60000),
			    new Employee("Eve", "Finance", 70000)
		);
		Map<String, Employee> mapEmp = employees.stream()
				.collect(Collectors.groupingBy(Employee::department, 
						Collectors.collectingAndThen(
								Collectors.maxBy(Comparator.comparingDouble(Employee::salary)), 
								Optional::get)));
		System.out.println(mapEmp);
	}
}