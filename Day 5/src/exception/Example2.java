package exception;
/**
 * Multiple Catch Blocks
 * @author suryavanshi
 *
 */
public class Example2{
   public static void main(String args[]){
     try{
         int a[]=new int[7];
         //a[4] = 30 / 0;
         a[11] = 30 / 5;
         System.out.println("It will not print");
     }
     catch(ArithmeticException e){
        System.out.println("Warning: ArithmeticException");
     }
     catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Warning: ArrayIndexOutOfBoundsException");
     }
     catch(Exception e){
        System.out.println("Warning: Some Other exception");
     }
   System.out.println("Out of try-catch block...");
  }
}