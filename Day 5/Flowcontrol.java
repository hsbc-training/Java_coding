package pack1;

public class Flowcontrol {
static void mymethod(int test) throws Exception{
	System.out.println("Method 1");
	if (test==12)
		throw new Exception();
	return;
}
public static void main(String[] args) {
	int test=12;
	try {
		System.out.println("try 1");
		mymethod(test);
	}
	catch(Exception e) {
		System.out.println("An exception ");
	}
	finally {
		System.out.println("Finally");
	}
	System.out.println("Out of all");
}
}
