package car;

class Operations {
	
	void addition(int a, int b)
	{
		System.out.println("Parent Addition is "+(a+b));
	}
	
	void subtraction(int a, int b)
	{
		System.out.println("Addition is "+(a-b));
	}

}

public class Calculation extends Operations
{
	void addition(int a, int b) 	//Overridden Method
	{
		System.out.println("Child Addition is "+(a+b));
	}
	
	void addition(int a, int b, int c) 	//Overloaded Method
	{
		System.out.println("Child Addition is "+(a+b+c));
	}
	
	public static void main(String args[])
	{
		int a = 10, b = 20, x = 30;
		Calculation c = new Calculation();
		
		
		c.addition(a, b, x);	//Polymorphism
		c.addition(a, b);
		c.subtraction(a, b);
	}
}
