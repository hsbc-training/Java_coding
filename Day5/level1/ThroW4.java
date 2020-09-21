package level1;

public class ThroW4 {
public static void main(String[] args) {
	ThroW4 obj=new ThroW4();
	try {
		obj.method3();
	}
	catch(ArithmeticException e) {
		System.out.println(e);
	}
	
	
}
void method1() throws ArithmeticException
{
	throw new ArithmeticException("Calculation error");
}
void method2() throws ArithmeticException{
	method1();
}
void method3() {
	method2();
}
}
