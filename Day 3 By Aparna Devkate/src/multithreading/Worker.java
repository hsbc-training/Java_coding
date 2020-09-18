package multithreading;

public class Worker implements Runnable{
	
	/*
	 * public Worker(String name) {
	 * 
	 * super(name); }
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Within worker thread : "+Thread.currentThread());
	}

}
