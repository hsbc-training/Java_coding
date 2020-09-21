package abstract_method;

interface A
{
    int x=10;
}
interface B
{
    int x=100;
}
public class Hello implements A,B
{
    public static void Main(String args[])
    {
    	
       System.out.println(A.x);
       System.out.println(B.x);
    }
}