package java_b;

interface Sum extends Display{
	 int sumofTwo(int a,int b);
	 int sumofThree(int a,int b,int c);
}

//abstract class Sum{
//	abstract int sumofTwo(int a,int b);
//	abstract int sumofThree(int a,int b,int c);
//	
//	void display()
//	{
//		System.out.println("Inside parent");
//	}
//}

public class Demo implements Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum d=new Demo();
		System.out.println(d.sumofTwo(1,2));
		System.out.println(d.sumofThree(1,2,3));
		d.disp();

	}

	@Override
	public int sumofTwo(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
		
	}

	@Override
	public int sumofThree(int a, int b, int c) {
		// TODO Auto-generated method stub
		return a+b+c;
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		System.out.println("Diplay");
		
	}

}
