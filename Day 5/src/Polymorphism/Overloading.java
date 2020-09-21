package Polymorphism;

class Overloading {
	void demo(int a)
	{
		System.out.println("a:" + a);
	}

	
	void demo(int a , int b)
	{
		System.out.println("a and b"+a+","+b);
	}

	
	double demo(double a)
	{
		System.out.println("Double a" + a);
		return a*a;
	}

}

