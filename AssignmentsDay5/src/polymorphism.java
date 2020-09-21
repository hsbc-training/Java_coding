//runtime

//class Animal
//{
//	void sound()
//	{
//		System.out.println("Animal making sound");
//	}
//}
//
//public class polymorphism extends Animal{
//
//	public void sound()
////	{
////		System.out.println("Neigh");
////	}
////		
////		public static void main(String[] args) {
////			Animal obj=new polymorphism();
////			//Animal obj=new Animal();
////			//polymorphism poly=new Animal();
////			obj.sound();
////		}
//	
//
//	
//}


//compiletime poly

//class overload
//{
//	void demo(int a)
//	{
//		System.out.println("a:" +a);
//	}
//	void demo(int a,int b)
//	{
//		System.out.println("a and b"+a+","+b);
//	}
//	double demo(double a)
//	{
//		System.out.println("double a:"+a);
//		return a*a;
//	}
//}
//
//public class polymorphism {
//	public static void main(String[] args) {
//		
//		overload obj=new overload();
//		double result;
//		obj.demo(10);
//		obj.demo(10,20);
//		result=obj.demo(5.5);
//		System.out.println("o/p"+result);
//	}
//}

//Static binding
//class Human{
//   public static void walk() //static final functions are binded at compile time based on refrence type
//   {
//       System.out.println("Human walks");
//   }
//}
//public class polymorphism extends Human{
//   public static void walk()
//   {
//       System.out.println("Boy walks");
//   }
//   public static void main( String args[]) {
//       Human obj = new polymorphism();
//       Human obj2 = new Human();
//       obj.walk();
//       obj2.walk();
//   }
//}
//

//
		//dynamic binding
//class Human{
// 
//   public void walk()
//   {
//       System.out.println("Human walks");
//   }
//}
//class polymorphism extends Human{
//  
//   public void walk(){
//       System.out.println("Boy walks");
//   }
//   public static void main( String args[]) {
//       Human obj = new polymorphism();
//         Human obj2 = new Human();
//       obj.walk();
//       obj2.walk();
//   }
//}
//abstract class eg
//abstract class Animal
//{
//	public abstract void sound();
//}
//public class polymorphism extends Animal
//{
//	public void sound()
//	{
//		System.out.println("woof");
//	}
//	
//	public static void main(String[] args) {
//		Animal obj=new polymorphism();
//		obj.sound();
//	}
//}

	//Interface eg
