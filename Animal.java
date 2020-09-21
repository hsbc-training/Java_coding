
public abstract class Animal {
	public abstract void sound();
	public void prt() {
		System.out.println("concrete method");
	}
}
class dog extends Animal{
	public void sound() {
		System.out.println("Bow bow");
	}
	public static void main(String[] args) {
		Animal dogs = new dog();
		dogs.sound();
		dogs.prt();
	}
}