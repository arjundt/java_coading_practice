package com.example.stream.collectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Department(String deptName) {}
record Employee(String name, Double salary, Department dept) {}

public class GroupingWithDownstreamCollector {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Arjun", 10000.0, new Department("SENG")));
		employees.add(new Employee("Ajinkya", 15000.0, new Department("SENG")));
		employees.add(new Employee("Pranjali", 18000.0, new Department("SENG")));
		employees.add(new Employee("Samant", 20000.0, new Department("ECGC")));
		employees.add(new Employee("Bhim", 30000.0, new Department("HR")));
		
		Map<Department, Double> averageSalaryByDepartment = employees.stream()
		    .collect(Collectors.groupingBy(Employee::dept,
		    		Collectors.averagingDouble(Employee::salary)));
		System.out.println(averageSalaryByDepartment);
		
		List<Employee> sortedBySalary = employees.stream().sorted(Comparator.comparing(Employee::salary).reversed()).toList();
		System.out.println(sortedBySalary);
	}
}