package practice;

import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SalaryCalculate {
	List<Worker> list = new ArrayList<>();
	
	void createWorker(){

		list.add(new DailyWorker("Vishnu", 2000, 4));
		list.add(new DailyWorker("Divya", 2000, 3));

		list.add(new SalariedWorker("Gopal", 100000));
	}

	double salaryCalculate() {
		double totalSalary = 0;
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Worker worker = (Worker) iterator.next();
			
			totalSalary+=worker.pay(4);

		}
		
		return totalSalary;
	}
	
	public static void main(String[] args) {
		SalaryCalculate s = new SalaryCalculate();
		s.createWorker();
		
		double totalSalary = s.salaryCalculate();
		
		System.out.println(totalSalary);
	}
}
