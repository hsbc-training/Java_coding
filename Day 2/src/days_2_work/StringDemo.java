package days_2_work;

import java.util.Arrays;

public class StringDemo {
	public static void main(String[] args) {
//		char[] helloArray = {'h','e','l','l','o'};
//		String helloString = new String(helloArray);
//		System.out.println(helloString);
//		createNames();	
		createCars();
	}
	private static void createCars() {
		Car[] cars = new Car[10];
		for(int i=0;i<10;i++) {
			Car car =new Car();
			car.setPrice(i+10);
			cars[i]=car;
		}
		System.out.println(Arrays.asList(cars));
		
	}
//	private static void createNames() {
//		String[] names = new String[10];
//		for(int i=0;i<10;i++) {
//			names[i]="ram"+(i+1);
//			
//		}
//		for(String s : names) {
//			System.out.print(s+" ");
//		}
//	}
}
	