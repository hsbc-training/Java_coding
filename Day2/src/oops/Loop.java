package oops;

public class Loop {

	public static void main(String args[]) {
		int x = 11;
		int y = 21;

		// while
		while (x <= 20) {
			System.out.print("value of x : " + x);
			x++;
			System.out.println();
		}

		// do while
		do {
			System.out.print("value of y : " + y);
			y++;
			System.out.println();
		} while (y <= 30);

		// for
		for (int z = 31; z <=40; z++) {
			System.out.print("value of z : " + z);
			System.out.println();
		}
	}
}