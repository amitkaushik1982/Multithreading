package com.multithreading;

public class ChildThread extends Thread {	
	
	private String threadName;
	
	public ChildThread(String name){
		this.threadName = name;
		start();
		System.out.println(this.threadName + " is ready to be executed");
	}
	
	public void run(){
		System.out.println(this.threadName +" started........");
		try {
			for(int i=1;i<=10;i++){
				System.out.println(this.threadName + " Counter:"+i);
				if(i%5 == 0){
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
