package java_b;

public class Horse extends Animal {
	
	public void sound() {
		System.out.println("Neigh");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal horse = new Horse();
		horse.sound();
	}

}
