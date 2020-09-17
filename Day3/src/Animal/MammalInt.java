package Animal;

public class MammalInt implements Animal {

	public void eat() {
		System.out.println("Mammal eats");
	}

	public void travel() {
		System.out.println("Mammal travels");
	}

	public void noOfLegs(int n) {
		System.out.println("The number of legs are = "+n);

	}

	public static void main(String args[]) {
		MammalInt obj = new MammalInt();
		obj.eat();
		obj.travel();
		obj.noOfLegs(4);
	}
}