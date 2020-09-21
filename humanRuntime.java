public class humanRuntime {
	//Overridden Method
	   public void walk()
	   {
	       System.out.println("Human walks");
	   }
	}
	class Girl extends humanRuntime{
	   //Overriding Method
	   public void walk(){
	       System.out.println("girl walks");
	   }
	   public static void main( String args[]) {
	       /* Reference is of Human type and object is
	        * Boy type
	        */
		   humanRuntime obj = new Girl();
	       /* Reference is of HUman type and object is
	        * of Human type.
	        */
		   humanRuntime obj2 = new humanRuntime();
	       obj.walk();
	       obj2.walk();
	   }
}
