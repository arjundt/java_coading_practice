package com.example.map;

import java.util.HashMap;
import java.util.Map;

class Employee{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
public class AlteringMapValue {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("A");
		
		Map<Employee, String> map = new HashMap<>();
		map.put(emp, emp.getName());
		
		emp.setName("B");
		
		System.out.println(map.get(emp));

	}
}