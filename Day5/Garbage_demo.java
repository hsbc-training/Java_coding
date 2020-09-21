public class Garbage_demo{   
   public static void main(String args[]){  
        /* Here we are intentionally assigning a null 
         * value to a reference so that the object becomes
         * non reachable
         */
	Garbage_demo obj=new Garbage_demo();  
	obj=null;  
		
        /* Here we are intentionally assigning reference a 
         * to the another reference b to make the object referenced
         * by b unusable.
         */
	Garbage_demo a = new Garbage_demo();
	Garbage_demo b = new Garbage_demo();
	b = a;
	System.gc();  
   }  
   protected void finalize() throws Throwable
   {
        System.out.println("Garbage collection is performed by JVM");
   }
}
