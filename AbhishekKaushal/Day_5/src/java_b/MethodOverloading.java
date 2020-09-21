package java_b;

class Overload {
	void demo (int a)
    {
       System.out.println ("a is: " + a);
    }
    void demo (int a, int b)
    {
       System.out.println ("a and b are: " + a + "," + b);
    }
    double demo(double a) {
       System.out.println("double a is: " + a);
       return a*a;
    }
}
public class MethodOverloading
{
    public static void main (String args [])
    {
        Overload Obj = new Overload();
        double result;
        Obj .demo(10);
        Obj .demo(10, 20);
        result = Obj .demo(5.5);
        System.out.println("Output is: " + result);
    }
}
