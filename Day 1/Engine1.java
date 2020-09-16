package oopsday1;
enum TYPE {P,D};
public class Engine1 {
	private TYPE type;
	Engine1(TYPE type)
	{
		super();
		this.type= type;
	}
	public TYPE gettype()
	{
		return type;
	}
}
