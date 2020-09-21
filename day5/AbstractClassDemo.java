package day5;
abstract class MyClass{
	public void disp() {
		System.out.println("Concrete method of parent class");
	}
	abstract public void disp2();
}
public class AbstractClassDemo extends MyClass{

	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println("Overriding abstract method");
	}
	
	public static void main(String[] args) {
		AbstractClassDemo obj = new AbstractClassDemo();
		obj.disp2();
	}
	
}
