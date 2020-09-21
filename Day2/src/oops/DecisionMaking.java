package oops;

public class DecisionMaking {

	public static void main(String[] args) {

		// if
		int x = 10;

		if (x < 20) {
			System.out.println("This is if statement");
		}

		// if else
		x = 30;

		if (x < 20) {
			System.out.println("This is if statement");
		} else {
			System.out.println("This is else statement");
		}

		// ?: Operator
		x = 30;
		String str;
		str = (x < 20) ? "This is if statement" : "This is else statement";
		System.out.println(str);

		// if else if
		x = 30;

		if (x == 10)

		{
			System.out.println("Value of X is 10");
		} else if (x == 20) {
			System.out.println("Value of X is 20");
		} else if (x == 30) {
			System.out.println("Value of X is 30");
		} else {
			System.out.println("This is else statement");
		}

		// nested if
		x = 30;
		int y = 10;

		if (x == 30) {
			if (y == 10) {
				System.out.println("X = 30 and Y = 10");
			}
		}

		// switch case
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
			System.out.println("Very Good!");
			break;
		case 'C':
			System.out.println("Well done");
			break;
		case 'D':
			System.out.println("You passed");
			break;
		case 'F':
			System.out.println("Better try again");
			break;
		default:
			System.out.println("Invalid grade");
		}
		System.out.println("Your grade is " + grade);

	}

}
