package car;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		List<Wheel> wheels = new ArrayList<>();
		wheels.add(new Wheel(10.4f,12.3f,2.4f,1000));
		wheels.add(new Wheel(10.4f,12.3f,2.4f,1000));
		wheels.add(new Wheel(10.4f,12.3f,2.4f,1000));
		wheels.add(new Wheel(10.4f,12.3f,2.4f,1000));
		
		Car c1 = new Car(wheels, 100000,new Engine(TYPE.Petrol),BRAND.BMW);
		System.out.println(c1.engine.getType());
		System.out.println(c1.getBrand());
	}

}
