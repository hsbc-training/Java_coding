
public class StringDemo {
	public static void main(String[] args) {
		String s1=new String("Hell");
		String s2="Hell";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
		sum(1,2);
		//StringPool in action in heap in jvm
//		
//		String s1="Hell";
//		String s2="Hell";
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s1==s2);
		
	}
	static int sum(int a,int b)
	{return a+b;
	}

}
