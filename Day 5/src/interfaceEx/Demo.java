package interfaceEx;

public class Demo implements MyInterface  {

	public void method1() {
		System.out.println("Implements method 1");
		
	}

	public void method2() {
		System.out.println("Implements method 2");
		}
	
	public static void main(String arg[])
	   {
		MyInterface obj = new Demo();
		obj.method1();
	   }

}
