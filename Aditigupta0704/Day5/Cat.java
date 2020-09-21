package Day5;

public class Cat extends Animal{
	 	public void sound()
	 	{
	 		System.out.println("Cat makes sound");
	 	}
	 	public static void main(String[] args)
	 	{
	 		Animal a=new Cat();
	 		a.sound();
	 	}
	 }

