package day3;

public interface AccountInterface {
	boolean open();
	float withdraw();
}

class SavingsAccount implements Account{
	
	public boolean open() {
		return false;
	}
	
	public float withdraw() {
		return 0;
	}
	
}
