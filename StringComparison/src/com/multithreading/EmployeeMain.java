package com.multithreading;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("Main method started.................");

		Employee emp1 = new Employee();

		EmployeeThread thread1 = new EmployeeThread("Child12", emp1, 201);
		
		System.out.println("This line is added in branch issue_1234");
		
		
		thread1.suspend();
		
		
		
		thread1.resume();
		
		
		System.out.println("Main method ended...................");

	}

}
