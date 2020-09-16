package interfaces;

public class switchcase {

	   public static void main(String args[]) {
	      char weekday = 'C';

	      switch(weekday) {
	         case 'A' :
	            System.out.println("Monday"); 
	            break;
	         case 'B' :
	        	 System.out.println("Tuesday"); 
	        	 break;
	         case 'C' :
	            System.out.println("Wednesday");
	            break;
	         case 'D' :
	            System.out.println("Thursday");
	         case 'F' :
	            System.out.println("Friday");
	            break;
	         default :
	            System.out.println("Invalid week day");
	      }
	      System.out.println("Today is " + weekday);
	   }
	}