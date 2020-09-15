package day1_oops;

import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args)
	{
		List<Wheel> wheels = new ArrayList<>();
		wheels.add(new Wheel(38.0F, 100.0F));
		wheels.add(new Wheel(39.0F, 101.0F));
		wheels.add(new Wheel(40.0F, 102.0F));
		wheels.add(new Wheel(41.0F, 103.0F));
		Car c1= new Car(wheels, new Engine1(TYPE.D), 100.0F);
		System.out.println(c1.price);
		System.out.println(c1.wheels);
		System.out.println(c1.enginetype.getengineType());
	}
}