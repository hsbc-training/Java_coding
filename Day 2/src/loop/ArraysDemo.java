package loop;
import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArraysDemo {

	public static void main(String[] args) {

//		Morning Session
//		double[] arr = {9.2,4.6,3.4,3.6,8.4};
//		
//
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i] + " ");
//		}
//
//		double total = 0;
//		for (int i = 0; i < arr.length; i++) {
//			total += arr[i];
//		}
//		System.out.println("Total is " + total);
//
//		double max = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > max) max = arr[i];
//		}
//		System.out.println("Max is " + max);  
		
		int[] numbers = new int[4];
		numbers[0] = 10;
		System.out.println(numbers[1]);
		numbers[2] = 20;
		
		createNames();
		Car cars[] = createCars();
		
		sortNumbers();
	}

private static void sortNumbers() {

		Integer[] numbers = {1,3,52,71,9};
		System.out.println("Before Sort "+Arrays.asList(numbers));
		Arrays.sort(numbers,Collections.reverseOrder());
		System.out.println("After Sort "+Arrays.asList(numbers));
		
	}

//	Using Constructor
//	private static void createCars() {
//		
//		Car[] cars = new Car[10];
//		for (int i = 0; i < cars.length; i++) {
//			cars[i] = new Car((1000.1f+i),Color.BLACK);
//		}
//		for (Car car : cars) {
//			System.out.println(car.getPrice()+" "+car.getColor());
//		}
//	}
	
	private static Car[] createCars() {
		Car[] cars = new Car[10];
		for (int j = 0; j < cars.length; j++) {
			Car car = new Car();
			car.setPrice(j*1000);
			car.setColor(Color.BLACK);
			cars[j]= car;
		}
		System.out.println(Arrays.asList(cars));
		return cars;
	}

	private static void createNames() {
		
		String[] names = new String[10];

		for (int i = 0; i < names.length; i++) {
			names[i] = "Ram"+i;
		}
		for (String string : names) {
			System.out.println(string);
		}
	}

}