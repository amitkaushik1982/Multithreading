package com.multithreading;

public class ChildThreadUsingInterface implements Runnable {
	
	private String threadName;
	
	public ChildThreadUsingInterface(String name){
		this.threadName = name;
		Thread newThreadObject = new Thread(this);
		newThreadObject.start();
		System.out.println(this.threadName + " is ready to be executed");
	}
		
	public void run() {
		System.out.println(this.threadName + " started........");
		try {
			for (int i = 1; i <= 10; i++) {
				System.out.println(this.threadName + " Counter:" + i);
				if (i % 5 == 0) {
					Thread.sleep(1);
				}
			}

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.threadName + " ended........");
	}
}
