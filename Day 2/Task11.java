package oopsday2;
import java.util.*;
import java.util.*;

public class Task11 {
	public static void main(String args[]) {
		int[] numbers = new int[4];
		numbers[0] = 10;
		System.out.println(numbers[1]);
		numbers[2] = 20;

//		CarDetails[] cars = createCars();
//		sortCars(cars);
		sortNumbers();
	}
	private static void sortNumbers() {
		Integer[] numbers= {1,-2,15,7,0,9};
		System.out.println("Before sort"+Arrays.asList(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.asList(numbers));
	}
	private static void sortCars(CarDetails[] cars) {
//		Collections.sort((List<CarDetails>)Arrays.asList(cars));
	}

	private static CarDetails[] createCars() {
		CarDetails[] cars = new CarDetails[10];
		for (int i = 0; i < 10; i++) {
			CarDetails car = new CarDetails();
			car.setPrice(i * 10000);
			cars[i] = car;
		}
		System.out.println(Arrays.asList(cars));
		return cars;
	}

	private static void createNames() {
		String[] names = new String[10];

		for (int i = 0; i < 10; i++) {
			names[i] = "Bhavya" + i;
		}
		System.out.println(names);
	}
}