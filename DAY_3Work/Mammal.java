package day3;

public class Mammal implements Animal {
	
	
	public void eat()
	{
		System.out.println("Eat");
	}
	
	public void travel()
	{
		System.out.println("Travel");
	}
	
	public int noOfLegs() {
	      return 0;
	   }

	   public static void main(String args[]) {
	      Mammal m = new Mammal();
	      m.eat();
	      m.travel();
	   }

}
