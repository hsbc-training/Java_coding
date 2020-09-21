package final_key;

	final class ABC1{  
	}  
		     
	class XYZ extends ABC1{   //final class can not be inherited 
	   void demo(){
	      System.out.println("My Method");
	   }  
	   public static void main(String args[]){  
	      ABC1 obj= new ABC1(); 
	      obj.demo();
	   }  
	}

