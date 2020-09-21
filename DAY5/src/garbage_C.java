
public class garbage_C {  
		   public static void main(String args[]){  
		        /* Here we are intentionally assigning a null 
		         * value to a reference so that the object becomes
		         * non reachable
		         */
			garbage_C obj=new garbage_C();  
			obj=null;  
				
		        /* Here we are intentionally assigning reference a 
		         * to the another reference b to make the object referenced
		         * by b unusable.
		         */
			garbage_C a = new garbage_C();
			garbage_C b = new garbage_C();
			b = a;
			System.gc();  
		   }  
		   protected void finalize() throws Throwable
		   {
		        System.out.println("Garbage collection is performed by JVM");
		   }
		
}
