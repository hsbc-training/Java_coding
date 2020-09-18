package p1;

import java.util.*;
import java.awt.*;
import java.math.*;

public class Array {
	/*
	 * double[] myList; // preferred way. or double myList[]; // works but not
	 * preferred way. why????????????
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[] list = {23, 60, 22, 54, 77, 10, 8 , 70}; for( int x : list) {
		 * //advanced for loop System.out.println(x); }
		 * 
		 * int max= list[0]; for(int x:list) { if(x>max) { max=x; } }
		 * System.out.println("largest elemet is "+ max); //largest element
		 */
		/*
		 * int[] numbers = new int[4]; numbers[0]=10; System.out.println(numbers[1]);
		 * numbers[2]= 20;
		 */

		/*
		 * String[] ram = new String[10]; for(int i=0;i<10;i++) { ram[i]=
		 * String.format("Ram%d", i); }
		 * 
		 * System.out.println(ram[8]);
		 */

		Car[] cars = createCars();
//			sortCars();
		sortNumbers();

	}

	private static void sortNumbers() {
		Integer[] numbers = { 3, 2, 1, 5, 7, 9 }; // int-> primitive, Integer->no primitive
		System.out.println(Arrays.asList(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.asList(numbers));

	}

	/*
	 * private static void sortCars() { // TODO Auto-generated method stub
	 * 
	 * 
	 * }
	 */

	
	  private static Car[] createCars() { 
	  Car[] cars = new Car[10]; 
	  for (int i =0;i<10; i++) 
	  { 
		  Car car= new Car(); 
		  car.setPrice(i*10000); 
		  car.setColor(new Color(244,233,(int)Math.random()*255));
		  cars[i]=car;
		  
       }
	  
	  System.out.println(Arrays.asList(cars)); 
	  return cars; 
	  //this will call
//	  toStrings() function hence we need to override that method //to get the right
//	  values from the array
//	  
	  }
	 

}
