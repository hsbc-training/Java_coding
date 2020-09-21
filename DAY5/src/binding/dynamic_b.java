package binding;

public class dynamic_b extends dynamic_h {
	public void walk(){
	       System.out.println("Boy walks");
	   }
	   public static void main( String args[]) {
	       /* Reference is of Human type and object is
	        * Boy type
	        */
	       dynamic_h obj = new dynamic_b();
	       /* Reference is of HUman type and object is
	        * of Human type.
	        */
	       dynamic_h obj2 = new dynamic_h();
	       obj.walk();
	       obj2.walk();
	   }
}
