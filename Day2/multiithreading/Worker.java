package threading;

public class Worker implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("code executed"+Thread.currentThread());
	}

}
