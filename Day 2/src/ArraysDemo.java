import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;



public class ArraysDemo {
	public static void main(String [] args) {
		
		//Array of numbers
//		int [] numbers1 = new int[4];
//		numbers1[0]=10;
//		System.out.println(numbers1[1]);
//		numbers1[2]=20;
//		
//		Integer [] numbers2 = new Integer[4];
//		numbers2[0]=100;
//		System.out.println(numbers2[1]);
		
		//Array of Strings
		createNames();
		Car [] cars = createCars();
//		sortCars();
		sortNumbers();
		
		
		//Experiments
//		int [] numbers = {2,4,6,8,10};
//		int length = numbers.length;
//		int count=0;
//		for (int num : numbers) {
//			if(num%2==0) {
//				count++;
//			}
//		}
//		if(count==length) {
//			System.out.println("All numbers in array are multiples of 2");
//		}
//		else {
//			System.out.println("Only " + count + "of" + length +"are multiples of 2");
//		}
	}

	

	private static void sortNumbers() {
		int [] numbers = {100,12,53,17,-99};
		System.out.println(Arrays.asList(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.asList(numbers));
	}



//	private static void sortCars(Car[] cars) {
//		Collections.sort(Arrays.asList(cars));
//		
//	}



	private static  Car[] createCars() {
		Car [] cars = new Car[10];
		for(int i=0;i<10;i++) {
			Car car = new Car();
			car.setPrice(1000000*i);
			car.setColor(new Color((int)(Math.random()*255.0),(int)(Math.random()*255.0),(int)(Math.random()*255.0)));
			cars[i]=car;
		}
		System.out.println(Arrays.asList(cars));
		return cars;
	}



	private static void createNames() {
		String [] names= new String[10];
		int len = names.length;
		for(int i=0; i<len;i++) {
			int j=i+1;
			names[i]="Ram" + j;
		}
		
		for(int i=0; i<len;i++) {
			System.out.println(names[i]);
		}
	}
}
