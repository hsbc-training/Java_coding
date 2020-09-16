package oops;

import java.util.*;
import java.awt.Color;
import javax.swing.*;

public class ArraysDemo {
	public static void main(String args[]) {
		int[] numbers = new int[4];
		numbers[0] = 10;
		System.out.println(numbers[1]);
		numbers[2] = 20;

		//createNames();
		CarDetails[] cars = createCars();
//		sortCars(cars);
		sortNumbers();
	}

	private static void sortNumbers() {
		Integer[] numbers = {0,-1,1,2,51,7,9};
		System.out.println("Before Sort => "+Arrays.asList(numbers));
		Arrays.sort(numbers);
		System.out.println("Before Sort => "+Arrays.asList(numbers));
	}

	private static void sortCars(CarDetails[] cars) {
//		Collections.sort((List<Car>)Array.asList(cars));
	}

	private static CarDetails[] createCars() {
		CarDetails[] cars = new CarDetails[10];
		for (int i = 0; i < 10; i++) {
			CarDetails car = new CarDetails();
			car.setPrice(i * 10000);
			car.setColor(Color.BLUE);
			cars[i] = car;			
		}
		System.out.println(Arrays.asList(cars));
		return cars;
//		CarDetails carr = new CarDetails();
//		carr.setColor();
	}

	private static void createNames() {
		String[] names = new String[10];

		for (int i = 0; i < 10; i++) {
			names[i] = "Amisha" + i;
		}
		System.out.println(names);
	}
}