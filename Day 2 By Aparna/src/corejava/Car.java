package corejava;

public class Car {
	private float price;  //mutable
	private String color;  //mutable

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		//return "Car [price=" + price + ", color=" + color + "]";
		return this.price+"";
	}

}

