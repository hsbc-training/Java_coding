package oops;

import java.util.Arrays;

public class ArraysDemo {
	
	public static void main(String[] args) {
		int[] numbers= new int[4];
		numbers[0]=10;
		System.out.println(numbers[1]);
		numbers[2]=20;
		
		createNames();
		createCars();
		sortNumbers();
	}
	
	private static void sortNumbers() {
		Integer[] numbers= {1,2,5,0,9};
		System.out.println("Before sort"+ Arrays.asList(numbers));
		Arrays.sort(numbers);
		System.out.println("After sort"+ Arrays.asList(numbers));
	}
	
	private static void createNames()
	{
		String[] names= new String[10];
		for(int i=0; i<10; i++)
		{
			names[i]="ram"+i ;
		}
		System.out.println(names);
	}
	
	private static void createCars()
	{
		//String[] car= new String[10];
		//Cars[] carsobj= new Cars[10];
		Cars[] cars= new Cars[10];
		for(int i=0; i<10; i++)
		{
			//System.out.println(names);
			//carsobj[i]= new Cars();	
			
			Cars car= new Cars();
			
			car.setPrice(i*100000);
			cars[i]=car;
		}
		
		System.out.println(Arrays.asList(cars));
	}

}
