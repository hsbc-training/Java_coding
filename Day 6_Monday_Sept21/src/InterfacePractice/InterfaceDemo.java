package InterfacePractice;

/*
 * @Author Pratham Sharma
 * Package Created to practice interface
 */
interface Inf1 {
	public void method1();
}

interface Inf2 extends Inf1{
	public void method2();
}

public class InterfaceDemo implements Inf2{
	
	@Override
	public void method1() {
		System.out.println("In method1");
		
	}

	@Override
	public void method2() {
		System.out.println("In method2");
		
	}
	
	public static void main(String[] args) {
		Inf2 obj = new InterfaceDemo();
		obj.method1();
		obj.method2();
	}

}
