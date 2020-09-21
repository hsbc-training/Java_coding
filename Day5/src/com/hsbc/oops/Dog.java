package com.hsbc.oops;

abstract class Animal2 {
	// abstract method
	public abstract void sound();
}

//Dog class extends Animal class
public class Dog extends Animal2 {

	public void sound() {
		System.out.println("Woof");
	}

	public static void main(String args[]) {
		Animal2 obj = new Dog();
		obj.sound();
	}
}