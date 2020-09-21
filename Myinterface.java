
public interface Myinterface {
	public void method1();
	public void method2();
}
class mine implements Myinterface{
	public void method1() {
		System.out.println("method 1 is running");
	}
	public void method2() {
		System.out.println("method 2 is running");
	}
	public static void main(String[] args) {
		Myinterface m = new mine();
		m.method1();
		m.method2();
	}
}