package java_b;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "HSBC";
		String s2 = new String("HSBC");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
		
		sum(1,2);
	}
	static int sum(int a,int b)
	{
		return a+b;
	}
}
