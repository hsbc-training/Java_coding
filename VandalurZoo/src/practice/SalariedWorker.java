package practice;

public class SalariedWorker extends Worker{
	public SalariedWorker(String name, float salaryRate) {
		super(name, salaryRate);
		// TODO Auto-generated constructor stub
	}

	double pay(int hours){
		return hours * 5 * getSalaryRate();
	}
}
