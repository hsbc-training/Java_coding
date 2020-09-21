package exceptionhandling;

class F {
	public static void main(String args[]) {
		try {
			int num = 121 / 0;
			System.out.println(num);
		} catch (ArithmeticException e) {
			System.out.println("Number should not be divided by zero");
		}
		/*
		 * Always executes
		 */
		finally {
			System.out.println("This is finally block");
		}
		System.out.println("Out of try-catch-finally");
	}
}
