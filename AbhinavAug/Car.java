import java.util.List;
public class Car {

	public float price;
	public Engine1 enginetype;//composition Has-A Relationship
	List<Wheel> wheels;//State
	
	
 public Car(List<Wheel> wheels, Engine1 enginetype,float price) {
	super();
	this.wheels= wheels;
	this.enginetype=enginetype;
	this.price=price;
}
}

