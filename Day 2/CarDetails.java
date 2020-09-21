package oopsday2;
//this is with task 11
import java.awt.Color;
public class CarDetails {
	private float price;
	private Color color;
	
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
		return this.price+"";
	}
}
