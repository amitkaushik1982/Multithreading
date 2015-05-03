package com.multithreading;

public class ThreadMainUsingInterface {
	public static void main(String[] args) {
		System.out.println("Main Method Started................");
		
		ChildThreadUsingInterface childThreadUsingInterfaceObject1 = new ChildThreadUsingInterface("ChildThreadUsingInterface-1");
		ChildThreadUsingInterface childThreadUsingInterfaceObject2 = new ChildThreadUsingInterface("ChildThreadUsingInterface-2");
		ChildThreadUsingInterface childThreadUsingInterfaceObject3 = new ChildThreadUsingInterface("ChildThreadUsingInterface-3");
		ChildThreadUsingInterface childThreadUsingInterfaceObject4 = new ChildThreadUsingInterface("ChildThreadUsingInterface-4");
		System.out.println("Main Line 1");		
		System.out.println("Main Line 2");
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Main Line 3");
		System.out.println("Main Method Ended................");

	}
}
