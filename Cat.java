
public class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("Meow");
	}
	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.sound();
	}
}
