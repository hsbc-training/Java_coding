package java_b;

public class FinallyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(myMethod());

	}

	private static int myMethod() {
		// TODO Auto-generated method stub
		try {
			return 7;
		}
		finally {
			return 10;
		}
		
	}

}
