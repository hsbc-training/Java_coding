package p1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Wheel> wheels = new ArrayList<>();
		Car c1 = new Car(wheels, 100000.0F, new Engine(TYPE.DIESEL));
		wheels.add(new Wheel(20.0F, 10.0F));
		wheels.add(new Wheel(20.0F, 10.0F));
		wheels.add(new Wheel(20.0F, 10.0F));
		wheels.add(new Wheel(20.0F, 10.0F));
		
		System.out.println(c1.price);
		System.out.println(c1.engine.enginetype());

	}

}
