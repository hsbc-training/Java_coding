package Synchronization;

class Tables{
	
	
	public void createTable(int num) throws InterruptedException {
		int i=1;
		while(i<=10) {
			System.out.println(num*i);
			i++;
			Thread.sleep((long) (50+Math.random()*4));
			
		}
	}
}

class Thread1 extends Thread{
	Tables table;
	Thread1(Tables table){
		this.table = table;
	}
	
	public void run() {
		try {
			table.createTable(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class Thread2 extends Thread{
	
	Tables table;
	Thread2(Tables table){
		this.table=table;
	}
	
	public void run() {
		
		try {
			table.createTable(7);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}



public class ThreadSyncDemo {
	public static void main(String[] args) {
		Tables table = new Tables();
		
		Thread1 t1 = new Thread1(table);
		Thread2 t2 = new Thread2(table);
		t1.start();
		t2.start();
		
	}
}
