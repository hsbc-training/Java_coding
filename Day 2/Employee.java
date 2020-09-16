package second;

public abstract class Employee {
	public Employee(String name, String address, int number) {
		this.name = name;
		this.address = address;
		this.number = number;
	}

	private String name;
	private String address;
	private int number;
	
	public double computePay() {
		System.out.println("Inside Employee computePay");
		return 0.0;
	}

	public void mailCheck() {
		System.out.println("Mailing a check to " + this.name + " " + this.address);
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
	
	
	public static void main(String[] args) {
		

	}

}
