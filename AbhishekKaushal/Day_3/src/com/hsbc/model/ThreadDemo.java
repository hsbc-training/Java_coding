package com.hsbc.model;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("code executed in which thread"+Thread.currentThread());
		Thread t1 = new Thread(new Worker(),"tt");
		t1.start();
		//t1.run();
		Thread t2 = new Thread(new Worker());
		//t1.run();
		t2.start();

	}

}
