import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args)
	{List<Wheel> wheels=new ArrayList<>();
	  wheels.add(new Wheel(56.7F,56.8F,89.6F,43.7F));
	  wheels.add(new Wheel(56.7F,56.8F,89.6F,43.7F));
	  wheels.add(new Wheel(56.7F,56.8F,89.6F,43.7F));
	  wheels.add(new Wheel(56.7F,56.8F,89.6F,43.7F));
	  
	  Car c1=new Car(wheels,new Engine1(TYPE.D),100000.0F);
	  System.out.println(c1.price);
	  System.out.println(c1.engine.getEngineType());}

}
