import java.awt.Color;
import java.util.Arrays;


		class Car
		{
		private float price;
		private Color color;
		public float getPrice() {
			return price;
		}
		public void setPrice(float price) {
			this.price = price;
		}
		public Color getColor() {
			return color;
		}
		public void setColor(Color color) {
			this.color = color;
		}
		
		@Override
			public String toString() {
				// TODO Auto-generated method stub
				return this.price+" ";
			}
		
		public static void main(String[] args) {
			
			//createCars();
			sortNumber();
			
//			Car[] cars=new Car[10];
//			
//			
//				for (int i = 0; i < 10; i++) {
//					Car car=new Car();
//					car.setPrice(i*100000);
//					car.setColor(Color.red);
//					cars[i]=car;
//				} 
//			System.out.println(Arrays.asList(cars));	
//			
		}
		//sorting
		private static void sortNumber() {
			// TODO Auto-generated method stub
			Integer[] numbers= {0,-1,2,51,7,9};
			System.out.println("Before sort"+Arrays.asList(numbers));
			Arrays.sort(numbers);
			System.out.println(Arrays.asList(numbers));
			
		}
		private static Car[] createCars() {
			// TODO Auto-generated method stub
			
			Car[] cars=new Car[10];
			
			
			for (int i = 0; i < 10; i++) {
				Car car=new Car();
				car.setPrice(i*100000);
				car.setColor(Color.red);
				cars[i]=car;
			} 
		System.out.println(Arrays.asList(cars));	
		return cars;
		}
		
		}
	