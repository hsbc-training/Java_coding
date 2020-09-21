
public class Loop {
	public static void main(String args[])
	{
		/*
		 * int [] numbers= {10,20,30,40,50}; for(int x: numbers) {System.out.print(x);
		 * System.out.print(",");} System.out.println(); String [] names= {"James",
		 * "Larry", "Tom"}; for(String s:names) {System.out.print(s);
		 * System.out.print(",");}
		 */
		/*
		 * int x = 10;
		 * 
		 * while( x < 20 ) { System.out.print("value of x : " + x ); x++;
		 * System.out.print("\n"); }
		 */
    int x = 15;

    do {x++;
    	if(x==17)
      	   {continue;}
       System.out.print("value of x : " + x );
       
       
//       if(x==17)
//       break;
       
       System.out.println();
    }while( x < 20 );
}
}