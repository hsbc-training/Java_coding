
public class Worker implements Runnable {
	
	//public Worker(String name)
	//{
		//super(name);
	//}

	@Override
	public void run() {
		System.out.println("code executed in which thread ="+ Thread.currentThread());
		
	}
	

}
