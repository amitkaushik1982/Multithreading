package com.multithreading;

public class EmployeeThread extends Thread{
	
	private String threadName;
	
	private Employee employee;
	
	private int empId;
	
	public EmployeeThread(String threadName, Employee employee, int empId){
		this.threadName = threadName;
		start();
		
		this.employee  = employee;
		this.empId = empId;
	}

	public void run() {
		//System.out.println("This is thread class: "+threadName);
		String empDetails = employee.printEmployeeDetails();
		System.out.println(threadName + " Prints: " + empDetails);
		System.out.println(threadName + " is going to edit Employee");
		synchronized(this){
			System.out.println("line 1");
			employee.setEmployeeDetails(empId, "Govind", "Noida");
		}
		//System.out.println(threadName + " has modified Employee");
		empDetails = employee.printEmployeeDetails();
		//System.out.println(threadName + " Prints: " + empDetails);
		
		//5 steps program
		
	}

}
