package OOPS;

import java.util.List;

public class Car {
	public Car(List<Wheel> wheels, Engine1 engine, float price) {
		super();
		this.wheels = wheels;
		this.engine = engine;
		this.price = price;
	}

	List<Wheel> wheels;     //state
	public Engine1 engine;    //composition, Has-A relationship
	public float price;
}