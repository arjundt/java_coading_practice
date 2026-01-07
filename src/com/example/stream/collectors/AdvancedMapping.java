package com.example.stream.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

record Department(String deptName) {
}

record Employee(String name, Department department) {
}

public class AdvancedMapping {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Arjun", new Department("SENG")));
		employees.add(new Employee("Samant", new Department("ECGC")));
		employees.add(new Employee("Ajinkya", new Department("SENG")));
		employees.add(new Employee("Chandrakant", new Department("ITSS")));
		employees.add(new Employee("Bhim", new Department("HR")));
		employees.add(new Employee("Pranjali", new Department("SENG")));

		Map<Department, List<String>> departmentEmployeeNames = employees.stream().collect(
				Collectors.groupingBy(Employee::department, Collectors.mapping(Employee::name, Collectors.toList())));
		System.out.println(departmentEmployeeNames);
		System.out.println("///////////////////////////////////////////////////////");

		departmentEmployeeNames.forEach((key, value) -> {
			System.out.println(key.deptName() + ": " + value);
		});
		System.out.println("///////////////////////////////////////////////////////");

		departmentEmployeeNames.forEach((key, value) -> {
			System.out.println(key.deptName() + ": " + String.join(", ", value));
		});
		System.out.println("///////////////////////////////////////////////////////");
		
		Map<Department, String> stringValueMap = employees.stream().collect(Collectors.groupingBy(Employee::department,
				Collectors.mapping(Employee::name, Collectors.joining(", "))));
		for(var map : stringValueMap.entrySet()) {
			System.out.println(map.getKey().deptName() + ": " + map.getValue());
		}
	}
}