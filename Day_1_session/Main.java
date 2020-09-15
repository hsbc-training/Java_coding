package modelCar;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Wheel> wheels = new ArrayList<>(); 
		wheels.add(new Wheel(10F,20F));
			Engine e1 = new Engine(TYPE.p);
			Car c1 = new Car(wheels,e1,100);
			System.out.println(c1.price);
			System.out.println(c1.engineType.getEngineType());
			
		}
}
