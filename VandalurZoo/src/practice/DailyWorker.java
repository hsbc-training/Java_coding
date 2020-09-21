package practice;

public class DailyWorker extends Worker{
	private int noOfDays;
	
	public DailyWorker(String name , float salaryRate , int noOfDays) {
		super(name , salaryRate);
		this.noOfDays = noOfDays;
	}
	
	double pay(int hours){
		return hours * noOfDays * getSalaryRate(); 
	}

	
}
