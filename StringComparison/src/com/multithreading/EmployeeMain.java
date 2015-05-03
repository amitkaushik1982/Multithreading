package com.multithreading;

public class EmployeeMain {

	public static void main(String[] args) {
		System.out.println("Main method started.................");

		Employee emp1 = new Employee();

		EmployeeThread thread1 = new EmployeeThread("Child1", emp1, 201);
		EmployeeThread thread2 = new EmployeeThread("Child2", emp1, 301);

		
		
		thread1.suspend();
		
		
		
		thread1.resume();
		
		
		System.out.println("Main method ended...................");

	}

}