import java.awt.Color;
import java.util.Arrays;
import java.util.Collections;
public class Car {
	private float price;
	private Color color;
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	private static void createCars() {
		Car[] cars = new Car[10];
		for(int i = 0; i < 10; i++)
		{
			Car car = new Car();
			car.setPrice(i*100000);
			car.setColor(Color.cyan);
			cars[i] = car;
		}
		System.out.println(Arrays.asList(cars)); // Converting array in to list
	}
	
	private static void sortCars(Car[] args) {
		//Collections.sort();

	}
	
	private static void sortNumber() {
		// TODO Auto-generated method stub
		Integer[] numbers = {1,6,2,3,4,5};
		Arrays.sort(numbers);
		System.out.println(Arrays.asList(numbers));
	}
	
	public String toString() {
		return this.price+" "+ this.color+"\n ";
	}
	public static void main(String[] args)
	{
		createCars();
		sortNumber();
	}
}
