package java_b;

public class JavaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaExample obj = new JavaExample();
		obj = null;

		/*
		 * Here we are intentionally assigning reference a to the another reference b to
		 * make the object referenced by b unusable.
		 */
		JavaExample a = new JavaExample();
		JavaExample b = new JavaExample();
		b = a;
		System.gc();

	}

	protected void finalize() throws Throwable {
		System.out.println("Garbage collection is performed by JVM");
	}

}
