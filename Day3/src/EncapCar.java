
public class EncapCar {
	private float price;
	//initializing price as private so it's scope is in this class only
	//but getter setter is made public so it can be accessed by other classes
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
