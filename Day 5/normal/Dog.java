package normal;

public class Dog extends Animal{
public void Sound() {
System.out.println("The sound of dog is bark");
}
public static void main(String[] args) {
	Animal use=new Dog();
	use.Sound();
}
}
