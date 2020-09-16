package oops;

public class BreakandContinue {
	public static void main(String args[]) {

		// break
		System.out.println("Break -");
		int[] numbers1 = { 10, 20, 30, 40, 50 };
		for (int x : numbers1) {
			if (x == 30) {
				break;
			}
			System.out.print(x);
			System.out.println();
		}

		// continue
		System.out.println("Continue -");
		int[] numbers2 = { 10, 20, 30, 40, 50 };
		for (int x : numbers2) {
			if (x == 30) {
				continue;
			}
			System.out.print(x);
			System.out.println();
		}
	}
}