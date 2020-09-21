package inheritance;

class Calculation {
	   int z;
		
	   public void addition(int x, int y) {
	      z = x + y;
	      System.out.println("The sum is(from parent class):"+z);
	   }
		
	   public void Subtraction(int x, int y) {
	      z = x - y;
	      System.out.println("The difference between the given numbers:"+z);
	   }
	}

	public class My_Calculation extends Calculation {
	   public void multiplication(int x, int y) {
	      z = x * y;
	      System.out.println("The product of the given numbers:"+z);
	   }
	   public void addition(int x, int y) {
		      z = x + y;
		      System.out.println("The sum is(from child class):"+z);
		   }
		
	   public static void main(String args[]) {
	      int a = 20, b = 10;
	      //My_Calculation demo = new My_Calculation(); //child class will be called
	      //Calculation demo = new My_Calculation(); //child class will be called
	      //My_Calculation demo = new Calculation(); //this line will give error
	      Calculation demo = new Calculation(); //parent class will be called
	      demo.addition(a, b);
	      //demo.Subtraction(a, b);
	      //demo.multiplication(a, b);
	   }
	}
