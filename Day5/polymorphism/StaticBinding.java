package polymorphism;
class Human{
	   public static void walk()
	   {
	       System.out.println("Human walks");
	   }
	}
	class Boy extends Human{
	   public static void walk(){
	       System.out.println("Boy walks");
	   }
	 }
public class StaticBinding {
	  public static void main( String args[]) {
	       /* Reference is of Human type and object is
	        * Boy type
	        */
	       Human obj = new Boy();//both methods are static therefore cannot be overridden
	       /* Reference is of HUman type and object is
	        * of Human type.
	        */
	       Human obj2 = new Human();
	       Boy ob3=new Boy();
	       obj.walk();
	       obj2.walk();
	       ob3.walk();
	   }
}
