package day3;

public class Mammal implements Animal {
	public void eat() {
		System.out.println("eat");
	}
	public void travel() {
		System.out.println("travel");
	}
	public int numberOfLegs() {
		return 0;
	}
	public static void main(String args[]) {
		Mammal m = new Mammal(); 
		m.eat();
		m.travel();
	}
}

