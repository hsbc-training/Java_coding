package Day5;

public class FinalVar {

	final int i=9;
	public void change()
	{
		//i=10; error
		System.out.println("You cant change final value");
	}
	public static void main(String[] args)
	{
		FinalVar f=new FinalVar();
		f.change();
	}
}
