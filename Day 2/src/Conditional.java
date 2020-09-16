
public class Conditional {
	public static void main(String [] args) {
		int x = 15;
		
		//If else
		if(x<5) {
			System.out.println("value less than 5");
		}
		else if(x<10 && x>5) {
			System.out.println("Value between 5 and 10");
		}
		else if(x>10 && x<15) {
			System.out.println("Value between 10 and 15");
		}
		else {
			System.out.println("Value greater than or equal to 15");
		}
		
		//Switch case
		
		switch(x) {
		
		case 10:
			System.out.println("value is 10");
			break;
		case 15:
			System.out.println("value is 15");
			break;
		default:
			System.out.println("Value neither 10 nor 15");
			break;
		}
	}
}
