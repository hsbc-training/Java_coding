
public class HUman {
	public static void walk() {
		System.out.println("human walks");
	}
}

class Boy extends HUman{
	public static void walk() {
		System.out.println("boy walks");
	}
	public static void main(String[] args) {
		//reference =human type
		//object = boy type
		HUman obj = new Boy();
		obj.walk();
		//reference human type
		//object human type
		HUman obj2 = new HUman();
		obj2.walk();
	}
}
//===static binidng

