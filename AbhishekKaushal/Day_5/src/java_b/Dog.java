package java_b;

abstract class Animal1{
	abstract void sound();
}

public class Dog extends Animal1 {
	
	public void sound()
	{
		System.out.println("Bark");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d= new Dog();
		d.sound();
		
		//Animal1 obj =new Animal1();
	}
}
