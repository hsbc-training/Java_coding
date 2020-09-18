package p1;

class Table
{
	void printTable(int n)
	{
		for(int i=0; i<5; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class myThread1 extends Thread 
{
	Table t;

	public myThread1(Table t) {
		super();
		this.t = t;
	}
	
	@Override
	public void run() {
		t.printTable(5);
	}
	
}

class myThread2 extends Thread 
{
	Table t;

	public myThread2(Table t) {
		super();
		this.t = t;
	}
	
	@Override
	public void run() {
		t.printTable(100);
	
	}
}

public class TestSynch
{
	public static void main(String[] args) {
		Table obj = new Table();
		myThread1 t1 = new myThread1(obj);
		myThread2 t2 = new myThread2(obj);
		t1.start();
		t2.start();
	}
}