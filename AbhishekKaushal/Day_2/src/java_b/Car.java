package java_b;

import java.awt.Color;

class Car
{
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
	public String toString() {
		return this.price+" "+this.color+"";
	}
}
