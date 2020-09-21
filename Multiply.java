//interface is always public
interface Multiply {
	public int multiply2(int a, int b);
	int multiply3(int a, int b, int c);
}
class mul implements Multiply{
	public int multiply2(int a, int b) {
		return a*b;
	}
	public int multiply3(int a, int b, int c) {
		return a*b*c;
	}
	public static void main(String[] args) {
		Multiply ans = new mul();
		System.out.println(ans.multiply2(2,6));
		System.out.println(ans.multiply3(2,3,4));

	}
}
