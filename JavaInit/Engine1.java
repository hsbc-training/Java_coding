import java.util.*;

public class main {
	public static void main(String args[]){ 
		List<Wheel> wheels = new ArrayList<>();
		wheels.add(new Wheel(1.0F,10.F,14.0F,1.0F));
		wheels.add(new Wheel(1.0F,10.F,14.0F,1.0F));
		wheels.add(new Wheel(1.0F,10.F,14.0F,1.0F));
		wheels.add(new Wheel(1.0F,10.F,14.0F,1.0F));
		
		
		Car c=new Car(wheels,20000,new Engine1(TYPE));
		System.out.println(c.wheels);
		System.out.println(c.price);
		System.out.println(c.engine.type.Petrol);
		
	}

}
