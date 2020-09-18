package Abstraction;

public class Employee {
	private String name;
	private String address;
	private int number;

	public Employee(String name,String address,int number) {
		
		System.out.println("Constructor call to Employee");
		
		this.name=name;
		this.address=address;
		this.number = number;
	}

	public double computePay() {
		System.out.println("Inside Employee compute Pay");
		return 0.0;
	}

	public void mailCheck() {
		System.out.println("Checking mail to " + this.name + " " + this.address);
	}

	public String toString() {
		return name + " " + address + " " + number;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String newAddress) {
		address = newAddress;
	}

	public int getNumber() {
		return number;
	}
}
