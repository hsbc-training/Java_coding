package oops;
enum TYPE {
	D,P
};
public class Engine1 {
	private TYPE engineType;

	Engine1(TYPE engineType) {
		super();
		this.engineType = engineType;
	}

	public TYPE getengineType() {
		return engineType;
	}
}
