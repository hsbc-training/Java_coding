package p1;

public class LoopControl {

   public static void main(String args[]) {
      int x = 10;

     /* while( x < 20 ) {
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
      }
      */
      
      do {
          System.out.print("value of x : " + x );
          x++;
          System.out.print("\n");
       }while( x < 20 );
   }
}