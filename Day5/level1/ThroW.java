package level1;

public class ThroW {
public static void main(String[] args) {
	ThroW obj=new ThroW();
	int testnum=12;
	try {
		System.out.println("try first");
		obj.myMethod(testnum);
		System.out.println("try end");
	}
	catch(Exception e) {
		System.out.println("an exception");
	}
	finally {
		System.out.println("inside finally");
	}
	System.out.println("out of everything");
	
}
public void myMethod(int testnum)throws Exception
{
	System.out.println("start mwthod");
	if(testnum==12)
		throw new Exception();
	System.out.println("end-mymethod");
}
}
