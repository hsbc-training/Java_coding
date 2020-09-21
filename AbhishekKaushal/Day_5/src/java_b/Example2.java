package java_b;

public class Example2 {
	public static void main(String args[]) {
		try {
			String str = null;
			System.out.println(str.length());
			String str1 = "bcn";
			System.out.println(str1.charAt(6));
			int v = Integer.parseInt("lkj");
			int a[] = new int[10];
			a[11] = 9;

		} catch (NullPointerException e) {
			System.out.println("NullPointerException..");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException!!");
		} catch (NumberFormatException e) {
			System.out.println("Number format exception occurred");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds");
		}
	}
}
