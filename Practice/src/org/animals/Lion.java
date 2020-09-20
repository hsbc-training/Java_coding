package org.animals;


public class Lion {
	private String color;
	private int age;
	
	void isVegetarian(){
		System.out.println("Lion is vegetarian");
	}
	
	void canClimb(){
		System.out.println("Lions cant climb");
	}
	
	public Lion(String color, int age) {
		super();
		this.color = color;
		this.age = age;
	}
}
