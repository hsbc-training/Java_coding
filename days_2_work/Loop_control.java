package days_2_work;

public class Loop_control {
	public static void main(String[] args) {
		int[] number = {10,20,30,40};
		for(int x : number) {
			System.out.println(x);
		}
		System.out.print("\n");
	    String [] names = {"James", "Larry", "Tom", "Lacy"};

	    for( String name : names ) {
	       System.out.print( name +" ");
	    }
	    System.out.println();
	    // do while code 
	    
	    int x=5;
	    do {
	    	System.out.println("Inside loop in do while");
	    }while(x!=5);
	    
	    // while code 
	    
	    while(x==5) {
	    	System.out.println("inside loop in while");
	    	x++;
	    }
	}
	
}
