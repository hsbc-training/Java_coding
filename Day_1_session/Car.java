package modelCar;
import java.util.List;

public class Car {
	public Car(List<Wheel> wheels, Engine eng, float price) {
		super();
		this.wheels = wheels;
		this.engineType = eng;
		this.price = price;
	}
	List<Wheel> wheels;
	public Engine engineType;
	public float price;
}
