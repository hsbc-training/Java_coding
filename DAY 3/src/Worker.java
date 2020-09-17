
public class Worker implements Runnable {

	public void run()
	{
		System.out.println("Code executed in which thread="+Thread.currentThread());
	}
}
