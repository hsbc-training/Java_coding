package day5;

public class Horse extends Animal {

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Neigh");
	}
	public static void main(String[] args) {
		Animal obj = new Horse();
		obj.sound();
	}
	
}
