package oops;
import java.util.ArrayList;
import java.util.List;
public class Main {

	public static void main(String[] args)
	{
		List<Wheels> wheel = new ArrayList<>();
		wheel.add(new Wheels(40.0F, 100.0F));
		Car c1= new Car(wheel, new Engine1(TYPE.DIESEL), 100000.0F);
		System.out.println(c1.price);
		System.out.println(c1.engine.getengineType());
	}
}