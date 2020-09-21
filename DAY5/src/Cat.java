
public class Cat extends Animal{
	public void sound()
	{
        System.out.println("Meow");
    }
    public static void main(String args[])
    {
    	Animal obj = new Cat();
    	obj.sound();
    }
}
