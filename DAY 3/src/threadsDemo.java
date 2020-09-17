
public class threadsDemo {
	public static void main(String[] args)
	{
		System.out.println("Code executed in which thread="+Thread.currentThread());
		Thread t1=new Thread(new Worker());
		t1.run();
		//Thread.currentThread();
	} 
}
