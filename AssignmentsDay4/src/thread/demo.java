package thread;

class Table{
	void printTable(int n)
	{
		for(int i=0;i<5;i++)
			System.out.println(i*n);
			try {
				//Thread.sleep((int)Math.random()*100);
				Thread.sleep(400);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}

class MyThread11 extends Thread
{
	Table t;
	MyThread11(Table t)
	{
		this.t=t;
	}
	
	public void run()
	{
		t.printTable(5);
	}
}

class MyThread22 extends Thread
{
	Table t;
	MyThread22(Table t)
	{
		this.t=t;
	}
	
	public void run()
	{
		t.printTable(100);
	}
}

public class demo {
public static void main(String[] args) {
	Table obj=new Table();
	MyThread11 t1=new MyThread11(obj);
	MyThread22 t2=new MyThread22(obj);
	t1.start();
	t2.start();
}
}
