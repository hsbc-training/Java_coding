package abstract_c;

public class Dog extends Animal{
	public void sound()
	{
		System.out.println("Woof");
	}
	public static void main(String[]args)
	{
		Animal a=new Dog();
		a.sound();
	}

}
