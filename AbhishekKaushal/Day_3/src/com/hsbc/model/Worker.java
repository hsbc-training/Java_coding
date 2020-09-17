package com.hsbc.model;

public class Worker implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("code executed in which thread"+Thread.currentThread());
	}

}
