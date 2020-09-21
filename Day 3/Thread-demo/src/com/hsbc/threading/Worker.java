package com.hsbc.threading;

public class Worker implements Runnable {
	@Override
	public void run() {
		System.out.println("Code executed in which thread : " + Thread.currentThread());
	}

}
