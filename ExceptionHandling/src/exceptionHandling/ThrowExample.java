package exceptionHandling;

public class ThrowExample {
	
	static void checkEligibility(int age , int weight)
	{
		if(age<10 && weight<35)
		{
			throw new ArithmeticException("Not eligible");
		}
		else
		{
			System.out.println("Registration completed");
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter to check eligibility");
		checkEligibility(9 , 20);
		System.out.println("Done");
		
	}

}
