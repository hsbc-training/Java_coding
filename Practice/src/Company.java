import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company {
		
		List<Worker> worker = new ArrayList<>();
		
		void WorkerList(){
				worker.add(new SalariedWorker("Gopal",1000));
				worker.add(new SalariedWorker("Divya",1000));
			
				
				worker.add(new DailyWorker("Vishnu",100,5));
			}
		
		int salaryCalcuate(){
			float totalSalary = 0;
			for (Iterator iterator = worker.iterator(); iterator.hasNext();) {
				Worker worker2 = (Worker) iterator.next();
				totalSalary+=worker2.pay(8);
			}
			System.out.println(worker);
			return (int) totalSalary;
		}
		
		public static void main(String[] args) {
			Company c = new Company();
			
			c.WorkerList();
			
			float totalSalary = c.salaryCalcuate();
			
			System.out.println("Total Salary of all the workers is : " + totalSalary);
		}

}
