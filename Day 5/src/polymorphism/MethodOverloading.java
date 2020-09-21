package polymorphism;
/**
 * Compile Time Polymorphism
 * @author suryavanshi
 *
 */

class Overloading{

	public void demo(int a) {
		System.out.println("a : " + a);
	}

	void demo(int a, int b) {
		System.out.println("a : " + a + " b : " + b);
	}

	double demo(double a) {
		return a*a;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.demo(1);
		o.demo(1,2);
		System.out.println("Square is : " + o.demo(5.5));
	}	
}
