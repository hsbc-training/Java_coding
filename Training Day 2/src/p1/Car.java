package p1;

import java.awt.Color;

public class Car {
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
		// TODO Auto-generated method stub
		return this.price+" " + this.color;
	}
	
	//overrode the toString() method because default implementation returns hashcode() of the values.
	private float price;
	private Color color;

}
