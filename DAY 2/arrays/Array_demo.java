package arrays;

import java.awt.Color;
//import java.awt.Color;
import java.util.Arrays; 
//import java.util.Collections;
//import java.util.Scanner;

public class Array_demo {
    public static void main(String[] args)
    { 
    	
    	int[]number=new int[4];
    	number[0]=10;
    	//System.out.println(number[1]);
    	number[2]=20;
    	
    	//createnames();
    	//create_numbers();
    	createcars();
    	//sortCars(cars);
		}
    private static void create_numbers() {
		Integer[] numbers= {0,-1,2,1,7,5,9};
		System.out.println("Numbers before sorting:"+Arrays.asList(numbers));
		Arrays.sort(numbers);
		System.out.println("Numbers after sorting:"+Arrays.asList(numbers));
		
	}
	/*private static void sortCars(car[] cars)
    {
    	Collections.sort(Arrays.asList(cars));
    }*/
    private static car[] createcars()
    {
        car[]cars=new car[10];  //array of null references
        System.out.println("Car price:");
        for (int i = 0; i < 10; i++) {
			car Car=new car(); //create object
			Car.setPrice(i*100000);
			Car.setColor(new Color(244,233,(int)Math.random()*255));        //set color to an object
			cars[i]=Car;      //store object into an array
		}
    	
    	System.out.println(Arrays.asList(cars));
    	return cars;
    }
    private static void createnames()
    {
    //Scanner s=new Scanner(System.in);
    String[]People_name=new String[10];
    System.out.println("Names:");
	for (int i = 0; i < People_name.length; i++) {
		People_name[i]="ram"+i;
    }
	for (int i = 0; i < People_name.length; i++) {
		System.out.print(People_name[i]);
		System.out.print(",");
    }
    }

}