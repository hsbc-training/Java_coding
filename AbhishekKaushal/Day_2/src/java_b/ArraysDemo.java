package java_b;

import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[4];
		numbers[0]=10;
		System.out.println(numbers[1]);
		numbers[2]=20;
		
		
//		String[] names = createNames();
//		System.out.println(names);
//		for(int i=0;i<10;i++)
//		{
//			System.out.println(names[i]);
//		}
		
		Car[] cars = createCars();
		//printCars(cars);
		System.out.println(Arrays.asList(cars));
		//sortedCars(cars);
		sortNumbers();
		
		
	}

private static void sortNumbers() 
{
		// TODO Auto-generated method stub
	Integer[] numbers = {1,2,5,7,9,3,-1};
	System.out.print(Arrays.asList(numbers));
	Arrays.sort(numbers);
	System.out.println();
	System.out.print(Arrays.asList(numbers));
}

//	private static void sortedCars(Car[] cars) {
//		// TODO Auto-generated method stub
//		Collections.sort((List<Car>)Arrays.asList(cars));
//	}

	private static void printCars(Car[] cars) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{
			System.out.println( cars[i].getPrice());
		}
		
	}

	private static Car[] createCars() {
		// TODO Auto-generated metho d stub
		Car[] cars = new Car[10];
		Random rand = new Random();
		for(int i=0;i<10;i++)
		{
			cars[i] = new Car();
			cars[i].setPrice((i+1)*200000.0F);
			cars[i].setColor(new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256)));
		}
		return cars;
	}

	private static String[] createNames() {
		// TODO Auto-generated method stub
		

		String[] names = new String[10];
		for(int i=0;i<10;i++)
		{
			names[i]="Ram"+(i+1);
		}
		return names;
	}

}
