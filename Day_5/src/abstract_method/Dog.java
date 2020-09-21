package abstract_method;

public class Dog extends Animal{
	public void sound() {
		System.out.println("woof");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj = new Dog();
		obj.sound();
	}

}
