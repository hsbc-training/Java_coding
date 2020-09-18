package oops;
import java.util.List;
public class Car {
	public Car(List<Wheel> wheels, Engine engine, float price) {
		super();
		this.wheels = wheels;
		this.engine = engine;
		this.price = price;
	}
	List<Wheel> wheels;
	public Engine engine;
	public float price;
}
