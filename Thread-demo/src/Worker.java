
public class Worker implements Runnable{

	@Override
	public void run() {
		System.out.println("code executed in which thread="+Thread.currentThread());
	}

}
