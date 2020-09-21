package inter_face;
interface i1{
	public void method1() ;
}
interface i2 extends i1 {
	public void method2();
}
//we just had to implement i2 because it already extends i1
//we will have to implement all method of i1  & i2
public class Example3 implements i2 {
public void method1() {
	System.out.println("inside 1");
}
public void method2() {
	System.out.println("inside 2");
}
public static void main(String[] args) {
	Example3 obj=new Example3();
	obj.method1();
	obj.method2();
}
}
