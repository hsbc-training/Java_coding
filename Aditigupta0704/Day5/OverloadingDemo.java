package Day5;

public class OverloadingDemo {

	public void add(int a,int b)
	{
		System.out.println("You are in method with 2 integers args");
		System.out.println(a+b);
	}
	public void add(int a,int b,int c)
	{
		System.out.println("You are in method with 3 integers args");
		System.out.println(a+b+c);
	}
	public void add(float a,float b)
	{
		System.out.println("You are in method with 2 float args");
		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
		OverloadingDemo od=new OverloadingDemo();
		od.add(3,4);
		od.add(1, 2,3);
		od.add(3.3f, 5.5f);
		
	}
}
