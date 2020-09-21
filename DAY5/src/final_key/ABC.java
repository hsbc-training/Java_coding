package final_key;

	class XYZ1{  
		   final void demo(){ //final method can not be overridden although can be inherited by the child class
		      System.out.println("XYZ Class Method");
		   }  
		}  
			     
		class ABC extends XYZ1{  
		   public static void main(String args[]){  
		      ABC obj= new ABC();  
		      obj.demo();  
		   }  
		}

