package oops;
enum TYPE {DIESEL, PETROL}

public class Engine {
	public Engine(TYPE type) {
		super();
		this.type = type;
	}

	public TYPE getType() {
		return type;
	}

	
	private TYPE type;
}
