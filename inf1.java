
interface inf1 {
	public void method1();
}
//inheritance of interface
interface inf2 extends inf1{
	public void method2();
}
class demo1 implements inf2{
	public void method1()
	{
		System.out.println("method 1");
	}
	public void method2()
	{
		System.out.println("Method 2");
	}
	public static void main(String[] args) {
		inf2 object = new demo1();
		object.method2();
	}
}