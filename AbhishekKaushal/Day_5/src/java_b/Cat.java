package java_b;

public class Cat extends Animal {
	
	public void sound() {
		System.out.println("Meow");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat = new Cat();
		cat.sound();
	}

}
