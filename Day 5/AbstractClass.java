package beginnerbook2;

abstract class demo1 {
	abstract void checkA();
	void checkB() {
		System.out.println("Check B method ");
	}
	
}
abstract class demo extends demo1{
	void checkA() {
		System.out.println("Check A method ");
	}
	abstract void checkC();
}
class AbstractClass extends demo{
	void checkC() {
		System.out.println("Check C method ");
	}
	//abstract void checkD();
	public static void main(String[] args) {
		AbstractClass ojeec=new AbstractClass();
		ojeec.checkC();
		ojeec.checkB();
		ojeec.checkA();
	}
}
