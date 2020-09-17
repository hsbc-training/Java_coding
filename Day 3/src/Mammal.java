

public class Mammal implements Animal {

	public void eats() {
		System.out.println("Mammal eats");
	}
	
	public void travels() {
		System.out.println("Mammal travels");
	}
	
	public int nooflegs() {
		return 0;
	}
	
	public static void main(String[] args) {
		Mammal m = new Mammal();
		m.eats();
		m.travels();
	}
	
}
