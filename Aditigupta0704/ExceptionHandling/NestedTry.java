package ExceptionHandling;

public class NestedTry {

	public static void main(String[] args) {
		try { // try parent

			System.out.println("Parent try");
			try {
				int i = 45 / 0;
			} catch (NullPointerException e) {
				System.out.println(e);
				System.out.println("NULL POINTER");

			} catch (ArrayIndexOutOfBoundsException e) {

				System.out.println("ARITHMETIC EXCEPTION");
			}
		}
		catch (Exception e) { // Catch parent
        System.out.println("PARENT CATCH");
		}
	 System.out.println("OUTSIDE TRY CATCH");
	}
}
