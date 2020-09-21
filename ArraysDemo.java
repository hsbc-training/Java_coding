import java.awt.Color;
import java.util.Arrays;
import java.util.Collection;

public class ArraysDemo {
	public static void main(String[] args) {
		int [] numbers=new int[4];
numbers[0]=10;
System.out.println(numbers[1]);
numbers[2]=20;

//create an array of strings
//createNames();
createCars();
//Car[] cars=createCars();
//sortCars(cars);
//sortNumbers();

	}

	private static void sortNumbers() {
		Integer [] numbers= {1,9,2,5,6,7};
		System.out.println(Arrays.asList(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.asList(numbers));
		
	}

	private static void sortCars(Car[] cars) {
//		Collection.sort(Arrays.asList(cars));
	}

	private static Car[] createCars() {
		Car[] diffcars= new Car[10];
		int price=1000;
		for (int i=0;i<10;i++)
		{  Car car=new Car();
			car.setPrice(price+100+i);
			car.setColor(new Color(244,233,(int)Math.random()*255));
			diffcars[i]=car;
		 //System.out.println(diffcars[i].getPrice());	
		}
		System.out.println(Arrays.asList(diffcars));
		return diffcars;
	}

	private static void createNames() {
		String [] names=new String[10];
		for(int i=0;i<10;i++)
			names[i]="ram"+i;
		System.out.println(names[6]);
		
	}

}
