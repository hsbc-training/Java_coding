package day5;
interface Multiply{
	public abstract int multiplyTwo(int a, int b);
	int multiplyThree(int a, int b, int c);
}
public class AbstractMethodInInterfaceDemo implements Multiply{

	@Override
	public int multiplyTwo(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int multiplyThree(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a*b*c;
	}
	public static void main(String[] args) {
		Multiply obj = new AbstractMethodInInterfaceDemo();
		System.out.println(obj.multiplyTwo(3, 7));
		System.out.println(obj.multiplyThree(1, 2, 3));
	}
	
}
