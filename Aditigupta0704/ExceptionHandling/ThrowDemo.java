package ExceptionHandling;

class myException extends Exception {
	myException(String msg) {
		super(msg);
	}
}

public class ThrowDemo {

	public static void check(int n) throws myException {
		if (n < 10) {
			throw new myException("Not in range!");
		} else {
			System.out.println("Success");
		}
	}

	public static void main(String[] args) {
		try {
			check(5);
		}

		catch (myException e) {
			System.out.println(e);
		}
	}
}
