package day5;
class Human{
	public static void walk() {
		System.out.println("Human Walks");
	}
}
public class Boy extends Human{
	public static void walk() {
		System.out.println("Boy walks");
	}
	
	public static void main(String[] args) {
		Human obj1 = new Boy();
		
		Human obj2 = new Human();
		
		Boy obj3 = new Boy();
		
		//Boy obj4 = new Human();
		
		obj1.walk();
		obj2.walk();
		obj3.walk();
	}
}
