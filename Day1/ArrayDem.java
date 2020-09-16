package Day1;

import java.awt.Color;
import java.util.Arrays;


public class ArrayDem {
public static void main(String[] args) {
	int[] numbers=new int[4];
	numbers[0]=10;
	System.out.println(numbers[1]);
	numbers[2]=20;
	
	
	//createNames();
	/*
	 * String[] name=new String[10]; for(int i=0;i<10;i++) { name[i]=br.readLine();
	 * }
	 */
	//anotherdemo();
	Carr[] cars=createCars();
	sortedCars(cars);//to sort in descending order
    sortNumbers();
}

private static void sortNumbers() {
	Integer[] numbers= {1,2,51,7,9};//converted from primitive to wrapper(INTEGER) to use toString()
	System.out.println(Arrays.asList(numbers));
	Arrays.sort(numbers);
	System.out.println(Arrays.asList(numbers));
}

private static void sortedCars(Carr[] cars) {
//	Collections.sort(Arrays.asList(cars));
	
}

private static Carr[] createCars() {
	Carr[] cars=new Carr[10];
	for(int i=0;i<10;i++) {
		Carr ob=new Carr();
		ob.setColor(Color.black);
	//this can also be used to set color	
	//	ob.setColor(new Color(244,233,(int)Math.random()*255));
		ob.setPrice(i*10000);
		/*
		 * Color c=ob.getColor(); ob.setColor(c);
		 */
		cars[i]=ob;
	}
	System.out.println(Arrays.asList(cars));
    return cars;
	
	
		
	}
	


private static void anotherdemo() {
	// TODO Auto-generated method stub
	
}

private static void createNames() {
	String[] name=new String[10];
	for(int i=0;i<10;i++) {
		name[i]="ram"+i;//10 different objects are created
	}
	for(int i=0;i<10;i++) {
	System.out.println(name[i]);
	
}
}}
