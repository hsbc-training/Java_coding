package javaProperties;
import interface_demo.java.*;

public class Main {
	
	public static void main(String[] args) {
		
		// Working on Encapsulation_Demo Class
		System.out.println("\nWorking on Encapsulation_Demo Class");
		Encapsulation_Demo e_demo = new Encapsulation_Demo();
		e_demo.setName("Aparna Devkate");
		System.out.println("Name of Employee :"+e_demo.getName());
		
		//Acessing  a class's method from other Package
		Animal animal1 = new Mammal();
		System.out.println("\nAcessing  a class's method from other Package");
		animal1.eat();
	}
}
