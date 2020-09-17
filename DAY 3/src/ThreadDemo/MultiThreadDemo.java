package ThreadDemo;

public class MultiThreadDemo {
	public static void main(String[] args) {
		System.out.println("Executed in which thread "+ Thread.currentThread());
		Thread t1 = new Thread(new Worker());
		t1.start();
		Thread t2 = new Thread(new Worker());
		t2.start();	
		
		
	}
}
