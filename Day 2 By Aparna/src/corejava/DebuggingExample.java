package corejava;

public class DebuggingExample {


	static int sum(int a,int b) {
		return a+b;
	}
	
	static void doWhileLoop() {

		int x = 10;
		// Printing odd numbers between 10 and 20
		System.out.println("Example of Do While Loop with Break and Continue :");
		do {
			x++;
			if (x%2==0)
				continue;
			else if (x > 20)
				break;
			else
				System.out.println("x :" + x);
			

		} while (true);
	}

	public static void main(String[] args) {

		// Do While Loop
		System.out.println("\nDEMO OF DEBUGGING");
		doWhileLoop();
		System.out.println(sum(13,34));
		System.out.println("End of Main");
	}

	
}
