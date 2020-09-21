
public class Worker implements Runnable {
	public void run()
	{
		System.out.println("in thread"+ Thread.currentThread());
	}
}
