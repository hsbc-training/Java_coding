package Polymorphism;

class MethodOverloading
{
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		double result;
		obj.demo(10);
		obj.demo(10,12);
		result = obj.demo(20.1);
		System.out.println(result);
	}
	
	
	
	
}