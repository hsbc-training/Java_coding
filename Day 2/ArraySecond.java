package second;
import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;

public class ArraySecond {
	public static void main(String[] args) {
		int[] numbers = new int[4];
		numbers[0]=10;
		System.out.println(numbers[1]);
		numbers[2]=20;
		Car[] carsArray = createCars();
		System.out.println(Arrays.asList(carsArray));
	}
	
	public static void sortNumbers() {
		int[] numbers = {5,4,3,2,1,-1};
		System.out.println(Arrays.asList(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.asList(numbers));
	}
	
	private static Car[] createCars() {
		Car[] carsArray = new Car[10];
		// Create an array of strings
				String[] s = new String[10];
				for(int i = 0; i < 10 ; i++) {
					s[i] = "Ram".concat(Integer.toString(i));
				}
				
				for(String a : s) {
					System.out.println(a);
				}
				
				
				for(int i = 0; i < 10; i++) {
					carsArray[i] = new Car(i * 10F, Color.BLUE);
				}
				System.out.println(Arrays.asList(carsArray));
				return createCars();
	}
}
