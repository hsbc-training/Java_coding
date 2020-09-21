
public class overload {
	void demo(int a)
	{
		System.out.println("a is "+a);
	}
	void demo(int a, int b)
	{
		System.out.println("a and b is "+ a +","+b);
	}
	double demo(double a) {
	    System.out.println("double a: " + a);
	    return a*a;
	}
}
class MethodOverloading
{
    public static void main (String args [])
    {
        overload Obj = new overload();
        double result;
        Obj .demo(10);
        Obj .demo(10, 20);
        result = Obj .demo(5.5);
        System.out.println("O/P : " + result);
    }
}
