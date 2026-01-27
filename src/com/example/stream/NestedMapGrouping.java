package com.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Collect Nested Map by Grouping
//Question: Group employees by department and then by age

record Employee(String name, String department, int age) {}

public class NestedMapGrouping {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("Alice", "HR", 25),
			    new Employee("Bob", "IT", 30),
			    new Employee("Charlie", "HR", 30),
			    new Employee("Dave", "IT", 25)
			);
		
			Map<String, Map<Integer, List<String>>> nestedMap = employees.stream()
					.collect(Collectors.groupingBy(Employee::department, 
					Collectors.groupingBy(Employee::age, 
							Collectors.mapping(Employee::name, Collectors.toList()))));
			System.out.println(nestedMap);
	}
}