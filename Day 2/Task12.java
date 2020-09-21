package oopsday2;

public abstract class Task12 {
	private String name;
	private String address;
	private int number;
	
	public Task12(String name,String address,int number) {
		System.out.println("Constructing an Employee");
		this.name=name;
		this.address=address;
		this.number=number;
	}
	
	public double computepay() {
		System.out.println("Inside Employee computePay");
		return 0.0;
	}
	
	public void mailCheck() {
		System.out.println("Mailing a checking to "+this.name+" "+this.address);
	}
	
	public String toString() {
		return name+" "+address+" "+number;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
	return address;
}
	
	public void setAddress(String newAddress) {
		address=newAddress;
	}
	
	public int getNumber() {
		return number;
	}
}
