package ThreadDemo;

public class Worker implements Runnable{

	@Override
	public void run() {
		System.out.println("Code executed in worker thread " + Thread.currentThread());
		
	}

}
