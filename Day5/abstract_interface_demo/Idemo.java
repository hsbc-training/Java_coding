package abstract_interface_demo;
//Interface
interface Multiply{
	   //abstract methods
	   public abstract int multiplyTwo(int n1, int n2);

	   int multiplyThree(int n1, int n2, int n3); //even if we don't define all methods in interface all public abstract

	}

	class Idemo implements Multiply{
	   public int multiplyTwo(int num1, int num2){
	      return num1*num2;
	   }
	   public int multiplyThree(int num1, int num2, int num3){
	      return num1*num2*num3;
	   }
	   public static void main(String args[]){
	      Multiply obj = new Idemo();
	      System.out.println(obj.multiplyTwo(3, 7));
	      System.out.println(obj.multiplyThree(1, 9, 0));
	   }
	}