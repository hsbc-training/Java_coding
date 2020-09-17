package Day3;


interface Animal{
	public void eat();
	public void travel();
}

public class Mammal_interface implements Animal {

	public void eat()
	{
		System.out.println("mammal eats");
		
	}
	public void travel()
	{
	
		System.out.println("mammal travels");
		
	}

 	public static void main(String[] args)
 	{
 		Mammal_interface m =new Mammal_interface();
 				m.eat();
 		        m.travel();
 	}
	
}
