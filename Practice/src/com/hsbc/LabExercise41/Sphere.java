package com.hsbc.LabExercise41;

public class Sphere extends Shape3D{
	private float radius;
	@Override
	double volume() {
		// TODO Auto-generated method stub
		double volume = (4/3) * 3.14 * Math.pow(3, radius);
		return volume;
	}

	@Override
	double surfaceArea() {
		// TODO Auto-generated method stub
		double surfaceArea = 4 * 3.14 * Math.pow(2, radius);
		return surfaceArea;
	}

	public Sphere(float radius) {
		super();
		this.radius = radius;
	}

}
