package Day2_loopstring;
import java.awt.Color;


import java.util.*;

public class ArrayDemo {
	
	
	public static void main(String[] args)
	{
		int[] numbers=new int[4];
		numbers[0]=10;
		//SOP(n[1]) will print 0 by default
		numbers[2]=20;
		//create string array
		//Car[] cars=createCars();
		//sortCars(cars);
		sortNumbers();
	}

	
	private static void sortNumbers() {
	
		//int[] numbers= {1,2,51,7,9};
		Integer[] numbers= {0,-1,2,55,4};
		System.out.println(Arrays.asList(numbers));
		//System.out.println(Arrays.asList(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.asList(numbers));
		//System.out.println("After sort")
	}


	private static void sortCars(Car[] cars) {
		//Collections.sort((List<Car>)(Arrays.asList(cars));
		
		
	}


	private static Car[] createCars() {
		Car[] cars=new Car[10];
		for(int i=0;i<10;i++)
		{
			Car car=new Car();
		car.setPrice(i*10000);
		cars[i]=car;
		}
		System.out.println(Arrays.asList(cars));
		return cars;
	}
	
	

}
