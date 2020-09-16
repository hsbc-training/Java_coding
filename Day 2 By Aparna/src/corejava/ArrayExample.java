package corejava;

import java.util.Arrays;
import java.util.Collections;

public class ArrayExample {

	private static void sortCars(Car[] cars) {
		
		//Collections.sort(Arrays.asList(cars));
	}
	
	
	private static void sortNumbers() {
		System.out.println("SORTING");
		Integer[] numbers = {1,2,-5,7,-9};
		System.out.println("\nBefore Sorting :"+Arrays.asList(numbers));
		Arrays.sort(numbers);
		System.out.println("After Sorting :"+Arrays.asList(numbers));
		
		
	}
	static void StringArray() {
		System.out.println("Printing String Array");
		String[] roles = new String[10];

		for (int i = 0; i < 10; i++) {
			roles[i] = "Role " + i;
		}

		for (String role : roles)
			System.out.println(role);

	}

	private static Car[] createCars() {

		System.out.println("\nARRAY OF OBJECT TYPE CAR");
		Car[] cars = new Car[10];
		Car newcar;
		for (int i = 0; i < 10; i++) {
			newcar = new Car();
			newcar.setColor("Color" + i);
			newcar.setPrice(i + 200000f);
			cars[i] = newcar;

		}

		System.out.println("\n\nPrinting using For Loop");
		for (Car sample : cars) {
			System.out.println(sample.getColor() + "  " + sample.getPrice());
		}

		System.out.println("\n\nPrinting using toString : \n" + Arrays.asList(cars));
		return cars;
	}

	static void IntArray() {

		int[] Marks = { 80, 70, 90, 95 };

		// Print all elements in array
		System.out.println("\n\nPrinting Marks Array :");
		for (int i : Marks) {
			System.out.println(i);
		}

		int Sum = 0;
		for (int i : Marks) {
			Sum += i;
		}
		System.out.println("\nSumming elements of Marks Array : " + Sum);

	}

	public static void main(String[] args) {

		// Summing elements of Marks Array

		StringArray();
		IntArray();
		Car[] cars = createCars();
		sortNumbers();

	}

}
