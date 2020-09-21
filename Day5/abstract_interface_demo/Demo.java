package abstract_interface_demo;
//Abstract class and method
abstract class MyClass{
	   public void disp(){
	     System.out.println("Concrete method of parent class");
	   }
	   abstract public void disp2();
	}

public	class Demo extends MyClass{
	   /* Must Override this method while extending
	    * MyClas
	    */
	   public void disp2()
	   {
	       System.out.println("overriding abstract method");
	   }
	   public static void main(String args[]){
	       Demo obj = new Demo();
	       obj.disp2();
	   }
	}
