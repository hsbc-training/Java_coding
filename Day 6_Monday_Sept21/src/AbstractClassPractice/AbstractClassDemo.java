package AbstractClassPractice;


abstract class Vehicle{
	abstract void numberOfWheels();
}

class Car extends Vehicle{
	@Override
	public void numberOfWheels() {
		System.out.println("A car has four wheels");
	}
}

class Bike extends Vehicle{
	@Override
	public void numberOfWheels() {
		System.out.println("A bike has two wheels");
	}
}

abstract class Sum {
	abstract int sumOfTwo(int a, int b);
	abstract int sumOfThree(int a, int b, int c);
}

class SumDemo extends Sum{

	@Override
	int sumOfTwo(int a, int b) {
		return a+b;
	}

	@Override
	int sumOfThree(int a, int b, int c) {
		return a+b+c;
	}

}
public class AbstractClassDemo {
	public static void main(String[] args) {
		System.out.println("\nAbstract Class example 1");
		Car car = new Car();
		Bike bike = new Bike();
		car.numberOfWheels();
		bike.numberOfWheels();
		System.out.println("\nAbstract Class example 2");
		SumDemo sumObj = new SumDemo();
		int sum1 = sumObj.sumOfTwo(10,20);
		int sum2 = sumObj.sumOfThree(12,13,14);
		System.out.println("Sum using two functions "+sum1+" "+sum2);
	}
	
}
