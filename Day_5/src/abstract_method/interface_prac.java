package abstract_method;

interface myinterface{
	public void method();
	public void method1();
}

interface myinterface2 extends myinterface{
	public void method2();
	public void method3();
}

public class interface_prac implements myinterface2 {
	public void method() {
		System.out.println("Implement method ");
	}
	public void method1() {
		System.out.println("implement method 1");
	}
	public void method2() {
		System.out.println("implement method 2");
		
	}
	public void method3() {
		System.out.println("implement method 3");
	}
	
	public static void main(String args[]) {
		myinterface2 obj = new interface_prac();
		obj.method();
		obj.method1();
		obj.method2();
		obj.method3();
	}
}
