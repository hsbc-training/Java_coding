package day2;

import java.awt.Color;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars = createCars();
		System.out.println(Arrays.asList(cars));
		sortedNumber();
	}

	private static void sortedNumber() {
		// TODO Auto-generated method stub
		Integer [] numbers = {4,2,1,66,34};
		System.out.println(Arrays.asList(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.asList(numbers));
	}

	private static Car[] createCars() {
		// TODO Auto-generated method stub
		Car [] cars = new Car[10];
		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car();
			cars[i].setColor(Color.CYAN);
			cars[i].setPrice(10000*i);
		}
		return cars;
	}

}
