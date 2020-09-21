package com.hsbc.LabExercise41;

public class Cylinder extends Shape3D{
	private float radius;
	private float height;
	
	@Override
	double volume() {
		double volume = 0;
		volume = 0.5 * height * radius * radius;
		return volume;
	}

	@Override
	double surfaceArea() {
		double surfaceArea = 0;
		surfaceArea = 2 * 3.14 * radius * (radius + height);
		return surfaceArea;
	}

	public Cylinder(float radius, float height) {
		super();
		this.radius = radius;
		this.height = height;
	}
	
}
