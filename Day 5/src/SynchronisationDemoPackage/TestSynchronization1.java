package SynchronisationDemoPackage;
/*
 * @Author Pratham Sharma
 * 
 * Package created to demo synchronization of threads
 * 
 * Class created to implement synchronization
 */
class Table {
	// when two threads are calling the same method and share the same object synchronized keyword is required
	synchronized void printTable(int n) {		
		for(int i=1;i<=5;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread1 extends Thread{
	Table t;
	MyThread1(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(5);
	}
}

class MyThread2 extends Thread {
	Table t;
	MyThread2(Table t){
		this.t=t;
	}
	public void run() {
		t.printTable(100);
	}
}

public class TestSynchronization1{
	public static void main(String [] args) {
		Table obj = new Table();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t2.start();
		t1.start();
		
	}
}
