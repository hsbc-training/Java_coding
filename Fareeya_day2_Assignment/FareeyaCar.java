package oops;
import java.util.List;
public class Car {
	
	
	public Car(List<Wheels> wheels, Engine1 engine, float price) {
		super();
		this.wheels = wheels;
		this.engine = engine;
		this.price = price;
	}

	List<Wheels> wheels;
	public Engine1 engine ;
	
	public float price;
	
	

}
