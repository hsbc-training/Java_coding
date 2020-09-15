package car;

enum TYPE {Petrol, Diesel};

public class Engine {
	
	TYPE type;

	public Engine(TYPE type) {
		super();
		this.type = type;
	}

	public TYPE getType() {
		return type;
	}
	
}
