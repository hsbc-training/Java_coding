package java_b;

class Human{
	public static void walk(){
		System.out.println("Human Walks");
	}
}

public class Boy {
	public static void walk()
	{
		System.out.println("Boy Walks");
	}
	
	public static void main(String[] args) {
		Human h=new Human();
		h.walk();
		//Human h1 = new Boy();
		//h1.walk();
	}
}
