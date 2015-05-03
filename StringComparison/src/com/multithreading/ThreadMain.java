package com.multithreading;

public class ThreadMain {

	public static void main(String[] args) {
		System.out.println("Main Method Started................");
		ChildThread childThreadObject1 = new ChildThread("ChildThread-1");
		childThreadObject1.setPriority(7);
		/*ChildThread childThreadObject1 = new ChildThread("ChildThread-1");
		ChildThread childThreadObject2 = new ChildThread("ChildThread-2");
		ChildThread childThreadObject3 = new ChildThread("ChildThread-3");
		ChildThread childThreadObject4 = new ChildThread("ChildThread-4");*/
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

					
		System.out.println("childThreadObject1 Info: " +childThreadObject1.isAlive());
	}

}
