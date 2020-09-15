enum TYPE { PETROL,DIESEL};
public class Engine1 {
private TYPE enginetype;

Engine1(TYPE enginetype) {
	super();
	this.enginetype = enginetype;
}
public TYPE getenginetype()
{
	return enginetype;
}
}
