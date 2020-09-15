
public class Calculation {
	int z;

	public void addition(int x, int y) {
		z = x + y;
		System.out.println(z);
	}

	public void subtraction(int x, int y) {
		z = x - y;
		System.out.println(z);
	}
}

class MyCalc extends Calculation {
	public void multi(int x, int y) {
		z = x * y;
		System.out.println(z);
	}

	public static void main(String args[]) {
		int x = 10;
		int y = 20;

		MyCalc c = new MyCalc();

		c.addition(x, y);
		c.subtraction(x, y);
		c.multi(x, y);
	}
}
