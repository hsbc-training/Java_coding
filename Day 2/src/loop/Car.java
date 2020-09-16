package loop;

import java.awt.Color;

public class Car{
	private float price;
	private Color color;

//	public Car(float price, Color color) {
//		super();
//		this.price = price;
//		this.color = color;
//	}

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
		return this.price+", "+this.color;
	}
}
