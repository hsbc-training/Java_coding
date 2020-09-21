package car;
import java.util.*;


public class Car {
	
	int price;
	public Engine engine;	
	List<Wheel> wheels;		//state, mutable
	private BRAND brand;	//immutable
	
	public Car(List<Wheel> wheels, int price, Engine engine, BRAND brand) {
		super();
		this.wheels = wheels;
		this.price = price;
		this.engine = engine;
		this.brand = brand;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	public BRAND getBrand() {
		return brand;
	}
	
}
