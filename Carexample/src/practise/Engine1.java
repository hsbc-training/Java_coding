package practise;
/*enum TYPE {DIESEL,PETROL};
public class Engine1 {
	 private TYPE engineType;
	 Engine1(Type engineType)
	 {
		 super();
		 this.engineType=engineType;
	 }
	 
	 
}*/

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
