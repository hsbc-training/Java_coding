package loop;

public class Condtional {
	public static void main(String args[]) {
		
		int a = 10, b = 20;
		int x = 0;
		
		if( a > b )												//If else 
			System.out.println("a is greater than b");
		else if( b > a ) {										//Nested if else
			System.out.println("b is greater than a");
			x = 1;
		}
		else
			System.out.println("a and b is equal");
		
		switch(x) {												//Switch
		case 0:
			System.out.println("This is Case 0");
			
		case 1:
			System.out.println("This is Case 1");
			
		default:
			System.out.println("Exit");
			System.exit(0);
		}
		
		
	}
}
