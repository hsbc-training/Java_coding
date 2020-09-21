package oops;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		List<wheel> wheels = new ArrayList<>();
		wheels.add(new wheel(10.0F, 2.0F, 15.5F, 1000000.0F));
		wheels.add(new wheel(11.0F, 2.5F, 13.5F, 1500000.0F));
		wheels.add(new wheel(12.0F, 3.0F, 12.0F, 2000000.0F));

		car c1 = new car(wheels, new Engine1(TYPE.DIESEL), 1000000.0F);
		System.out.println(c1.price);
		System.out.println(c1.engine.getengine());
	}
}