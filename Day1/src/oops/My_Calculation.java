package oops;

class Calculation {
	int z;

	public void addition(int x, int y) {
		z = x + y;
		System.out.println("Parent:" + z);
	}

}

public class My_Calculation extends Calculation {
	public void multiplication(int x, int y) {
		z = x * y;
		System.out.println("The product of the given numbers:" + z);
	}

	public void addition(int x, int y) {// overridden
		z = x + y;
		System.out.println("Child:" + z);
	}

	public void addition(int x, int y, int z) {// overload
		z = x + y;
		System.out.println("The sum of the given numbers:" + z);
	}

	public static void main(String args[]) {
		int a = 20, b = 10;
		//My_Calculation demo = new My_Calculation();			//Child
		//Calculation demo = new Calculation();					//Parent
		//My_Calculation demo = new Calculation();				//Child cannot point to parent
		Calculation demo = new My_Calculation();				//Always executes right.
		demo.addition(a, b);
		// demo.multiplication(a, b);
	}
}