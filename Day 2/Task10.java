package oopsday2;

public class Task10 {
	public static void main(String args[]) {
		String s1= new String("Hsbc");
		String s2="Hsbc";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
		sum(1,2);
	}
	static int sum(int a,int b) {
		return a+b;
	}
}
