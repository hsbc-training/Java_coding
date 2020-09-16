package decision_making;

public class Loops {

	public static void main(String[] args) {
		int n1=20, n2=30;
		if(n1==n2)
		{
			System.out.println("Both the numbers are same");
			
		}
		else
		{
			System.out.println("Numbers are different");
		}
		
		char grade = 'C';

	      switch(grade) {
	         case 'A' :
	            System.out.println("Excellent!"); 
	            break;
	   
	         case 'C' :
	            System.out.println("Well done");
	            break;
	            
	         case 'D' :
	            System.out.println("You passed");
	            break;
	            
	         case 'F' :
	            System.out.println("Better try again");
	            break;
	            
	         default :
	            System.out.println("Invalid grade");
	      }
	      System.out.println("Your grade is " + grade);
	   }

	}

}
