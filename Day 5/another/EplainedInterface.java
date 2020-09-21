package another;
import java.util.*;
import java.lang.*;
public class EplainedInterface implements MyInterface1,MyInterface2{
public void method1() {
	System.out.println("This is method 1");
}
public void method2() {
	System.out.println("This is method 2");
}
public void method3(){
	System.out.println("This is method 3");
}
public static void main(String[] args) {
	MyInterface2 ill=new ExplainedInterface();
	ill.MyInterface1.method1();
	ill.MyInterface1.method2();
	ill.MyInterface2.method3();
}
}

