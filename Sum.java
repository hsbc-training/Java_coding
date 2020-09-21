
public abstract class Sum {
	public abstract int sumOf2(int a, int b);
	public abstract int sumOf3(int a, int b, int c);
	public void disp() {
		System.out.println("method of class sum");
	}
}
class Addition extends Sum{
	public int sumOf2(int a, int b)
	{
		return a+b;
	}
	public int sumOf3(int a, int b,int c)
	{
		return a+b+c;
	}
	public static void main(String[] args) {
		Sum add = new Addition();
		System.out.println(add.sumOf2(3,4));
		System.out.println(add.sumOf3(3,4,5));
		add.disp();
	}
}
