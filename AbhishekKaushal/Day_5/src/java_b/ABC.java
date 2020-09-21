package java_b;

class XYZ {
	public void myMethod()
	{
		System.out.println("Overridden Method");
	}

}
public class ABC extends XYZ{
	public void myMethod()
	{
		System.out.println("Overriding method");
	}
	
	public static void main(String[] args) {
		XYZ obj = new ABC();
		obj.myMethod();
	}
}
