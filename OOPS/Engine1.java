package OOPS;


enum TYPE {
	DIESEL, PETROL
};

public class Engine1 {
	private TYPE eType;

	Engine1(TYPE eType) {
		super();
		this.eType = eType;
	}

	public TYPE getengine() {
		return eType;
	}
}