package GarbageCollectionPractice;

public class garbageCollectionDemo {
	public static void main(String args[]){  
        /* Here we are intentionally assigning a null 
         * value to a reference so that the object becomes
         * non reachable
         */
		garbageCollectionDemo obj=new garbageCollectionDemo();  
	obj=null;  
		
        /* Here we are intentionally assigning reference a 
         * to the another reference b to make the object referenced
         * by b unusable.
         */
	garbageCollectionDemo a = new garbageCollectionDemo();
	garbageCollectionDemo b = new garbageCollectionDemo();
	b = a;
	System.gc();  
   }  
   protected void finalize() throws Throwable
   {
        System.out.println("Garbage collection is performed by JVM");
   }
}
