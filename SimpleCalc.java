public class SimpleCalc {
	int add(int a, int b)
	{
		return a+b;
	} 
	int add(int a, int b,int c)
	{
		return a+b+c;
	}
}
class demo
{
	public static void main(String[] args) {
		SimpleCalc addition = new SimpleCalc();
		System.out.println(addition.add(3,5));
		System.out.println(addition.add(3,5,6));

	}
}
//compile time polymorphism, bcz while compiling it is being decided whether
// to call 1st add function or second.
//method overloading type 