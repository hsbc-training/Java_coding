package com.hsbc.LabExercise41;

public class Cube extends Shape3D {
	private float length = 0;

	@Override
	double volume() {
		// TODO Auto-generated method stub
		double volume = length * length * length;

		return volume;
	}

	@Override
	double surfaceArea() {
		// TODO Auto-generated method stub

		double surfaceArea = 6 * length * length;
		return surfaceArea;
	}

	public Cube(float length) {
		super();
		this.length = length;
	}

}
