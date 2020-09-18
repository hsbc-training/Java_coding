package Day1;
import java.awt.Color;

class Carr{
	private float price; //mutable
	private Color color; //mutable
	
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
		
		return this.price+""+color;
	}
	
}

