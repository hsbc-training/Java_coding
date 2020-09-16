package second;
import java.awt.Color;

public class Car {
	private float price;
	private Color color;
	
	Car(float price, Color color){
		this.price = price;
		this.color = Color.black;
	}
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
		return this.price+"";
	}
}
