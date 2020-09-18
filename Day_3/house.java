import Animals.*;

public abstract class house {
	abstract void add();
	void sub(){
		System.out.println("working");
	}
}

class subclass extends house {

	@Override
	void add() {
		// TODO Auto-generated method stub
		System.out.println("in subclass");
	}
	
	void eats(){
		System.out.println("imported eating");
	}
	
	public static void main(String[] args) {
		subclass s = new subclass();
		s.sub();
		s.add();
	}
}
