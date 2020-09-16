package oops;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Wheel> wheels = new ArrayList<>();
		wheels.add(new Wheel(1.2F, 7.4F, 36.8F, 5000.0F));
		wheels.add(new Wheel(1.2F, 7.4F, 36.8F, 5000.0F));
		wheels.add(new Wheel(1.2F, 7.4F, 36.8F, 5000.0F));
		wheels.add(new Wheel(1.2F, 7.4F, 36.8F, 5000.0F));

		Car c1 = new Car(wheels, new Engine1(TYPE.D), 1000000.0F);
		System.out.println(c1.price);
		System.out.println(c1.engine.getengineType());
	}

}
