package oops;

public class RunEncap {

	public static void main(String[] args) {

		EncapTest obj = new EncapTest();
		
		obj.setName("Amisha");
		obj.setAge(22);
		obj.setID("45120053");

		System.out.print("My name is " + obj.getName() + " and age " + obj.getAge());

	}

}
