package com.hsbc.LabExercise34;

public class Truck extends Vehicle {
	private int noOfWheels = 4;
	private String color = "Red";
	
	public Truck(int noOfWheels, String color) {
		super(noOfWheels, color);
		// TODO Auto-generated constructor stub
	}

	void display() {
		System.out.println(noOfWheels + "" + color);
	}
}
