package oopsday1;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		List<Wheel> wheels=new ArrayList<>();
		wheels.add(new Wheel(10.3F , 50.9F));
		wheels.add(new Wheel(18.2F , 62.5F));
		wheels.add(new Wheel(15.7F , 58.1F));
		Car c1=new Car(wheels, new Engine1(TYPE.D),1000000.0F);
		System.out.println(c1.price);
		System.out.println(c1.engine.gettype());
	}
}
