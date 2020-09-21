package Day5;

public class ChildAbstract extends AbstractDemo {

	public void show() {
		System.out.println("In child class");
	}
	public void demo()
	{
		System.out.println("This is the demo for abstract class");
	}
	public static void main(String[] args)
	{
		AbstractDemo ab=new ChildAbstract();
		ab.demo();
	}
}
