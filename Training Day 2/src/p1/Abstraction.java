package p1;

public abstract class Abstraction {
	private String name;
	private String Address;
	private int number;
	
	public Abstraction(String name, String address, int number) {
		super();
		System.out.println("Constructing an employee: ");
		this.name = name;
		Address = address;
		this.number = number;
	}
	
	public double coumputePay(){
		System.out.println("Inside Employee computePay");
		return 0.0;
	}
	
	public void mailCheck() {
		System.out.println("Mailing a check to " + this.name + " "+ this.Address);
	}
	
	public String toString() {
		return name + " " + Address + " " + number ;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return Address;
	}
	
	public void setAddress(String newAddress) {
		Address = newAddress;
	}
	
	public int getNumber() {
		return number; 
	}
	


	

}
