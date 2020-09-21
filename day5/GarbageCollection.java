package day5;

public class GarbageCollection {
	public static void main(String[] args) {
		GarbageCollection obj = new GarbageCollection();
		obj = null;
		
		GarbageCollection a = new GarbageCollection();
		GarbageCollection b = new GarbageCollection();
		
		b =a;
		System.gc();
	}
	
	protected void finalize() throws Throwable{
		System.out.println("Garbage collection is performed by JVM");
	}
}
