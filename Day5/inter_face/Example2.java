package inter_face;

//all of the below are correct
/*interface Try
{
   int a=10;
   public int a=10;
   public static final int a=10;
   final int a=10;
   static int a=0;
}*/


interface i11{
	int X=20;}
interface i22{
	int X=30;
	}
public class Example2 implements i11,i22{
public static void main(String[] args) {
	Example2 obj=new Example2();
	
	//if variables are same in two interfaces then we can call using this
	System.out.println(i11.X);
	System.out.println(i22.X);
}
}
