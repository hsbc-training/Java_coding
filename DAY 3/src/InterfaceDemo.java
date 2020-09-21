interface Animal {
   abstract void eat();
   abstract void travel();
}

 class Mammal implements Animal {

	   public void eat() {
	      System.out.println("Mammal eats");
	   }

	   public void travel() {
	      System.out.println("Mammal travels");
	   } 

	   public int noOfLegs() {
	      return 0;
	   }
 }
 
public class InterfaceDemo {
	public static void main(String[] args) {
		Mammal m = new Mammal();
		m.eat();
		m.travel();
	}
}
