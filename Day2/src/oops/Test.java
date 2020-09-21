package oops;

public class Test {

	public static void main(String args[]) {
		int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		String[] names = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQR", "STU" };

		for (int x : numbers) {
			System.out.print(x + ", ");
		}
		
		System.out.println();

		for (String name : names) {
			System.out.print(name + ", ");
		}
	}
}