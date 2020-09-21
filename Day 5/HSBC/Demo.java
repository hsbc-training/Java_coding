package HSBC;
import HSBC.total.improvised;
public class Demo {
public static void main(String[] args) {
	EmployeeDetails pop=new EmployeeDetails();
	int c=pop.Details(35000,7000);
	System.out.println("Main Salary structure: "+c);
	improvised rest=new improvised();
	int d=rest.others(1900,1500);
	System.out.println("Other incentives are: "+d);
	System.out.println("Final Salary: "+(c+d));
}
}
