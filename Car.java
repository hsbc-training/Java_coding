import java.util.List;

public class Car {
	List<Wheel> wheels;
	public Engine1 engine;
	public float price;
	public Car(List<Wheel> wheels, Engine1 engine, float price) {
		super();
		this.wheels = wheels;
		this.engine = engine;
		this.price = price;
	}

}
