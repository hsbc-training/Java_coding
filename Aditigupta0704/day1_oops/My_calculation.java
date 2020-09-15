package day1_oops;
	
	class Calculation_parent {
		   int z;
			
		   public void addition(int x, int y) {
		      z = x + y;
		      System.out.println("The sum is:"+z);
		   }
			
		   public void Subtraction(int x, int y) {
		      z = x - y;
		      System.out.println("The difference is:"+z);
		   }
		}

		public class My_calculation extends Calculation_parent {
		   public void multiplication(int x, int y) {
		      z = x * y;
		      System.out.println("The product is:"+z);
		   }
			
		   public static void main(String args[]) {
		      int a = 20, b = 10;
		      My_calculation d = new My_calculation();
		      d.addition(a, b);
		      d.Subtraction(a, b);
		      d.multiplication(a, b);
		   }
		}
	
