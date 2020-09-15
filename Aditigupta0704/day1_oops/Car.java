package day1_oops;

	import java.util.List;
	public class Car {
		
		List<Wheel> wheels;
		public Engine1 enginetype ;
		
		public float price;
		
		public Car(List<Wheel> wheels, Engine1 enginetype, float price) {
			super();
			this.wheels = wheels;
			this.enginetype = enginetype;
			this.price = price;
		}

	}

