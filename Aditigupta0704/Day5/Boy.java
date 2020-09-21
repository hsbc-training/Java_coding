package Day5;

class Human {
	public static void walk() {
		System.out.println("Human walks");
	}
}

public class Boy extends Human {
	public static void walk() {
		System.out.println("Boy walks");
	}

	public static void main(String args[]) {
		Human obj = new Boy();
		Human obj2 = new Human();
		Boy b=new Boy();
		b.walk();
		obj.walk();
		obj2.walk();
	}
}
