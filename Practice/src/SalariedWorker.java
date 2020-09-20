
public class SalariedWorker extends Worker{

	public SalariedWorker( String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}

	int pay(int hours){
		return 5*hours*salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+""+this.salary;
	}
}
