package ThreadsDemo;

public class Worker implements Runnable {
	public void run() {
		System.out.println("code executed in which thread="+Thread.currentThread());
	}

}
