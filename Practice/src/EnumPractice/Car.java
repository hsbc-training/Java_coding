package EnumPractice;

enum COLOR{
	RED,BLACK;
}

public class Car {
	private COLOR color;
	private int price;

	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(COLOR color,int price) {
		super();
		this.color = color;
		this.price=price;
	}

	public COLOR getColor() {
		return color;
	}

	public void setColor(COLOR color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.color + "" + this.price;
	}
}	
