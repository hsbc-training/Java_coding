package loop;

public class StringDemo {

	public static void main(String[] args) {

//		Morning Session
//		String string = "Java Basics";
//	    System.out.println( "Length of String is : " + string.length() );
//	    
//	    String concatString = " Demo";
//	    System.out.println("Concat String is "+(string+concatString));
//	    
//	    int x = 10;
//	    float y = 10.4f;
//	    System.out.printf("Integer value is %d and Float value is %f ",x,y);
		
		String s1 = new String("HSBC");
		String s2 = "HSBC";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
		
		System.out.println(sum(1,2));
	}
	
	static int sum (int a, int b) {
		return a+b;
	}

}
