package com.example.exception;

class Student {
	public String strReturn() {
		try {
			return "A";
		} catch (Exception e) {
			return "B";
		} finally {
			return "C";
		}
	}
}

public class TerminateFinally {

	public static void main(String[] args) {
		Student stu = new Student();
		System.out.println(stu.strReturn());
	}

}
