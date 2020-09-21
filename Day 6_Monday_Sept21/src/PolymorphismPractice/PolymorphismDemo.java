package PolymorphismPractice;

/*
 * Package created to practice polymorphism examples
 */


// Polymorphism at runtime 
class Animal {
	public void sound() {
		System.out.println("Animal is making a sound");
	}
}

class Horse extends Animal {
	@Override
	public void sound() {
		System.out.println("Neigh");
	}
}

class Cat extends Animal{
	@Override
	public void sound() {
		System.out.print("The parent class method using super keyword : ");super.sound();
		System.out.println("Meow");
	}
	
}

//To implement compile time polymorphsim we have to define the parent method as final/static/private 
//and the reference class will decide which method to call

class Animal1 {
	public static void sound() {
		System.out.println("Animal is making a sound");
	}
}

class Cat1 extends Animal1{
	public static void sound() {
		System.out.println("Meow");
	}
}


//Method Overloading/Static Polymorphism
class DisplayText {
	public void disp(char c) {
		System.out.println(c);
	}
	
	public void disp(char c, int num) {
		System.out.println(c+" "+num);
	}
	
	public void disp(float price) {
		System.out.println(price);
	}
	
	public void disp(int num, char c) {
		System.out.println(num+" "+c);
	}
}


public class PolymorphismDemo {
	public static void main(String[] args) {
		System.out.println("Runtime Polymorphsim");
		Animal cat = new Cat();
		Animal horse = new Horse();
		cat.sound();
		horse.sound();
		System.out.println("\nCompile Time Polymorphsim");
		Cat1 cat1 = new Cat1();
		Animal1 cat2 = new Cat1();
		cat1.sound();
		cat2.sound();
		System.out.println("\nMethod Overloading");
		DisplayText obj = new DisplayText();
		obj.disp('P');
		obj.disp('P',1);
		obj.disp(2.0f);
		obj.disp(1);//Type promotion form int to float
		obj.disp(1,'P');
		
	}
}


//To implement compile time polymorphsim we have to define the parent method as final/static/private 
//and the reference class will decide which method to call




