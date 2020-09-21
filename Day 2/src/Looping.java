
public class Looping {
	public static void main(String [] args) {
		
		//Link Codes
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
	      
	      
	     System.out.println("\n");
	     //While Loop & Break
	      int y=10;
	      
	      do {
	    	  System.out.println("Value of y :" + y);
	    	  if(y==11)
	    		  break;
	    	  y++;
	      }while(y<15);
	      
	      
	      
		System.out.println("\n");
		//Experiments
		//For loop & Continue
		for(int i=0;i<=20;i=i+1) {
			if(i%3==0) {
				System.out.println(i);
			}
			else {
				continue;
			}
		}
		int x=505;
		
		System.out.println("\n");
		//While loop
		while(x>500) {
			System.out.println(x);
			x=x-1;
		}
		System.out.println("\n");
		//for each
		int [] years = {2010,2020,2030,2040};
		
		for(int year : years) {
			if(year%10==0) {
				System.out.println(year);
			}
		}
			
	}
}
