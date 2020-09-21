
public class HOrse extends Animal {
 @Override
 	public void sound() {
		System.out.println("neigh");
 	}
 	public static void main(String[] args) {
		Animal horse = new HOrse();
		horse.sound();
	}
}
