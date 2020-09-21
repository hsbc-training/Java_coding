package normal;

class Boy {
public void walk() {
	System.out.println("Human walk");
}
}
class Stavsdy extends Boy{
	public void walk() {
		System.out.println("Boy walk ");
	}
	public static void main(String[] args) {
		Boy retr=new Stavsdy();
		retr.walk();
	}
}
