package oops;

import java.util.List;

public class car {
	public car(List<wheel> wheels, Engine1 engine, float price) {
		super();
		this.wheels = wheels;
		this.engine = engine;
		this.price = price;
	}

	List<wheel> wheels;     //state
	public Engine1 engine;    //composition, Has-A relationship
	public float price;

}