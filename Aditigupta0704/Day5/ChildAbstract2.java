package Day5;

public class ChildAbstract2 extends Abstract2{

	public void show()
	{
		System.out.println("In child");
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args)
	{
		ChildAbstract2 ab=new ChildAbstract2();
		ab.show();
		System.out.println(ab.add(3, 4));
		System.out.println(ab.add(3,4,5));
	}
	
}
