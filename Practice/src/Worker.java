
public abstract class Worker {
	String name;
	int salary;
		
		public Worker(String name,int salary) {
			super();
			this.name = name;
			this.salary = salary;
		}
		
		abstract int pay(int hours);
}
