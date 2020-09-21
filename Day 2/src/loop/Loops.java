package loop;

public class Loops {

	public static void main(String[] args) {

		int a = 10;

		System.out.println("While Loop Numbers:");
		while(a <= 20) {
			System.out.print(a+",");
			a++;
		}

		System.out.println("\n\nDo While Loop and Break Statement Numbers:");
		a = 10;
		do {
			System.out.print(a+",");
			if(a == 15)
				break;
			a++;
		}while( a < 20 );

		System.out.println("\n\nFor Loop");
		for(int x = 1; x < 10; x++) {
			System.out.print(x+",");
		}

		System.out.println("\n\nFor Each Loop");

		String names[] = {"ABC","DEF","XYZ","PQR"};

		for (String x : names) {
			System.out.print(x+",");
		}

		int [] numbers = {10, 20, 30, 40, 50};

		System.out.println("\nContinue Statement");
		for(int x : numbers ) {
			if( x == 30 ) {
				continue;
			}
			System.out.print(x+",");
		}
	}

}
