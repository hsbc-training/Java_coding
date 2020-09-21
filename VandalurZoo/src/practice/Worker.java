package practice;

public abstract class Worker {
	private String name;
	private float salaryRate;

	public Worker(String name, float salaryRate) {
		super();
		this.name = name;
		this.salaryRate = salaryRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalaryRate() {
		return salaryRate;
	}

	public void setSalaryRate(float salaryRate) {
		this.salaryRate = salaryRate;
	}
	
	abstract double pay(int hours);

}
