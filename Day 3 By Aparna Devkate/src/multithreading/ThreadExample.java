package multithreading;

public class ThreadExample {
	public static void main(String[] args) {
		
		System.out.println("We are in Thread Example : "+Thread.currentThread());
		Thread t1 = new Thread(new Worker());
		//t1.run();
		t1.start();
		
		Thread t2 = new Thread(new Worker());
		//t1.run();
		t2.start();
	}

}
