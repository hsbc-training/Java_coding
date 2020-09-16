package arrays;

import java.awt.Color;

public class car {
		private Color color; 
		private float price;
		/*car(Color color,float price)
		{
			color=this.color;
			price=this.price;
		}*/
		
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
	
		public String toString()
		{
			return this.price+","+this.color;
		}
	}

