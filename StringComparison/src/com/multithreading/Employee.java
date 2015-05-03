package com.multithreading;

public class Employee {

	int empID = 101;
	String name = "Amit";
	String address = "Boston";
	
	public String printEmployeeDetails(){
		return ("EMP ID: "+empID + ", Name: "+name +", Address: " + address);
	}
	
	public void setEmployeeDetails(int empId, String empName, String address){
		System.out.println("Control Inside setEmployeeDetails");
		this.empID = empId;
		this.name = empName;
		this.address = address;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Control exiting from setEmployeeDetails");
		
		//get highest number from database : 201
		//add 1+ : 202
	//	save new employee with new emp id : 202
	}
}
