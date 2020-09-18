package day2;
import java.awt.Color;
public class Car {
	private Color color;	
	private float price;
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [color=" + color + ", price=" + price + "]";
	}
	
}
