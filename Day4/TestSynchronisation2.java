class Table1{
	void printTable(int n)
	{
		for(int i=1;i<5;i++)
			System.out.println(n*i);
		try{
			Thread.sleep(500);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}
class Thread1 extends Thread{
	Table1 t;

	public Thread1(Table1 t) {
		
		this.t = t;
	}
	public void run()
	{
		t.printTable(500);
	}
}
class Thread2 extends Thread{
	Table1 t;

	public Thread2(Table1 t) {
		
		this.t = t;
	}
	public void run()
	{
		t.printTable(100);
	}
}
public class TestSynchronisation2 {
	public static void main(String[] args) {
		
	
	Table1 ty=new Table1();
	Thread1 t1=new Thread1(ty);
	Thread1 t2=new Thread1(ty);
	t1.start();
	t2.start();
	}
}
