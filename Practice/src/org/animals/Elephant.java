package org.animals;

public class Elephant {
	private String color;
	private int age;
	
	public void isVegetarian(){
		System.out.println("Elephant is vegetarian");
	}
	
	public static void canClimb(){
		System.out.println("Elephants cant climb");
	}
	
	public Elephant(String color, int age) {
		super();
		this.color = color;
		this.age = age;
	}
}
