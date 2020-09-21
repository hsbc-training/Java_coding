package com.hsbc.LabExercise34;

public class Vehicle {
	private int noOfWheels;
	private String color;
	
	public Vehicle(int noOfWheels, String color) {
		super();
		this.noOfWheels = noOfWheels;
		this.color = color;
	}
	
	void display(){
		System.out.println("In super class");
	}
}
