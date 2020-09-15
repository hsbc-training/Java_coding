package modelCar;
enum TYPE {d,p}
public class Engine {
	private TYPE engineType;
	Engine(TYPE engineType){
		this.engineType = engineType;
	}
	TYPE getEngineType() {
		return this.engineType;
	}
}