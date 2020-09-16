package modelCar;

public class Wheel {
	public Wheel(float thickness, float weight) {
		this.thickness = thickness ;
		this.weight = weight ;

	}
	private float thickness;
	private float weight;

	public float showThickness() {
		return this.thickness;
	}
}
