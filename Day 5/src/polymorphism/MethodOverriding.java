package polymorphism;
/**
 * Method Overriding
 * @author suryavanshi
 *
 */

class A {
	public void display() {
		System.out.println("Parent Class");
	}
}

public class MethodOverriding extends A {
	
	public void display() {
		//super.display();
		System.out.println("Child Class");
	}
	
	public static void main(String[] args) {
		
		A a = new A();
		a.display();
		
		A a1 = new MethodOverriding();
		a1.display();
		
		MethodOverriding m = new MethodOverriding();
		m.display();
	}
}
