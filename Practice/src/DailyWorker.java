
public class DailyWorker extends Worker{
	int noOfDays = 0;
	public DailyWorker(String name,int salary,int noOfDays) {
		super(name,salary);
		this.noOfDays = noOfDays;
		// TODO Auto-generated constructor stub
	}

	int pay(int hours){
		return (hours * noOfDays * salary);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name +""+ this.salary;
	}
}	
