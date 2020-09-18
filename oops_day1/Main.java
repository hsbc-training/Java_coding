package oops;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Car c1 = new Car(4, 'B', 100000.0F);
		//System.out.println(c1.price);
		//System.err.println(c1.enginetype);
		List<Wheel> wheels = new ArrayList<>();
		wheels.add(new Wheel(23,34,45,56));
		wheels.add(new Wheel(23,34,45,56));
		wheels.add(new Wheel(23,34,45,56));
		wheels.add(new Wheel(23,34,45,56));
		Car c1 = new Car(wheels, new Engine(TYPE.PETROL),100000);
		System.out.println(c1.engine.getType());
		
	}

}
