package p1;
enum TYPE{ DIESEL, PETROL};
public class Engine {
	private TYPE type;

	public Engine(TYPE type) {
		super();
		this.type = type;
	}
	
	public TYPE enginetype()
	{
		return type;
	}

}
