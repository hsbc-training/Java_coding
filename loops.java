package interfaces;

public class loops {
	public static void main(String args[]) {
	      int [] numbers = {10, 20, 30, 40, 50};

	      for(int x : numbers ) {
	         System.out.print( x );
	         System.out.print(",");
	      }
	      System.out.print("\n");
	      String [] names = {"James", "Larry", "Tom", "Lacy"};

	      for( String name : names ) {
	         System.out.print( name );
	         System.out.print(",");
	      }
	      int x =30;
	      while(x<35)
	      {
	    	  System.out.print("value of x : " + x );
	          x++;
	          System.out.print("\n");
	      }
	      int m = 1;
	      do {
	    	  System.out.println("m = "+m);
	    	  m++;
	    	  System.out.println("\n");
	      }while(m<5);
	   }
}
