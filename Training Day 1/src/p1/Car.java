package p1;

import java.util.*;

public class Car {

	public List<Wheel> wheels;
	public Car(List<Wheel> wheels, float price, Engine engine) {
		super();
		this.wheels = wheels;
		this.price = price;
		this.engine = engine;
	}
	public float price;
	public Engine engine;

}
