package day3.com.hsbc.model;

public class Order {
	private Address address;
	private float price;
	public Address getAddress() {
		return address;
	}
	public Order (Address address, float price) {
		this.address=address;
		this.price = price;
	}
	public float getPrice() {
		return price;
	}
}
