
public class mammal implements Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eat");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("travels");
	}

	public int legs() {
		return 0;
	}

	public static void main(String[] args) {
		mammal m = new mammal();
		m.eat();
		m.travel();
	}

}
