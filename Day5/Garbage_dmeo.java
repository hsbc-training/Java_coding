public class Garbage_dmeo{   
   public static void main(String args[]){  
        /* Here we are intentionally assigning a null 
         * value to a reference so that the object becomes
         * non reachable
         */
	Garbage_dmeo obj=new Garbage_dmeo();  
	obj=null;  
		
        /* Here we are intentionally assigning reference a 
         * to the another reference b to make the object referenced
         * by b unusable.
         */
	Garbage_dmeo a = new Garbage_dmeo();
	Garbage_dmeo b = new Garbage_dmeo();
	b = a;
	System.gc();  
   }  
   protected void finalize() throws Throwable
   {
        System.out.println("Garbage collection is performed by JVM");
   }
}
