package OOPS;


import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		List<Wheel> wheels = new ArrayList<>();
		wheels.add(new Wheel(10.0F, 2.0F, 15.5F, 1000000.0F));
		wheels.add(new Wheel(11.0F, 2.5F, 13.5F, 1500000.0F));
		wheels.add(new Wheel(12.0F, 3.0F, 12.0F, 2000000.0F));

		Car c1 = new Car(wheels, new Engine1(TYPE.PETROL), 3989766.0F);
		System.out.println(c1.price);
		System.out.println(c1.engine.getengine());
	}
}