
public class Threadsdemo {
	public static void main(String[] args) {
		System.out.println("In Threads Demo"+Thread.currentThread());
		Thread t1 = new Thread(new Worker());
		t1.start();
	}

	
}
