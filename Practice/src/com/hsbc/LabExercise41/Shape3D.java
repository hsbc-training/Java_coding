package com.hsbc.LabExercise41;

public abstract class Shape3D {
	abstract double volume();
	abstract double surfaceArea();
	
	public static void main(String[] args) {
		Cylinder c = new Cylinder(10,5);
		
		double surfaceArea = c.surfaceArea();
		double volume = c.volume();
		
		System.out.println("Surface Area and Volume of cylinder is : " + surfaceArea + "sq. unit and " + volume + "cc" );
		
		Sphere s = new Sphere(10);
		
		surfaceArea = s.surfaceArea();
		volume = s.volume();
				
		System.out.println("Surface Area and Volume of Sphere is : " + surfaceArea + "sq. unit and " + volume + "cc" );
		
		Cube cube = new Cube(5);
		
		double surfaceAreaCube = cube.surfaceArea();
		double volumeCube = cube.volume();
		
		System.out.println("Surface Area and Volume of Cube is : " + surfaceAreaCube + "sq. unit and " + volumeCube + "cc" );
	}

}
