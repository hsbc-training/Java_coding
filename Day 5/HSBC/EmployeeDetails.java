package HSBC;

public class EmployeeDetails {
 public int Details(int basic,int incentives ) {
	 return basic+incentives;
 }
 public static void main(String[] args) {
	EmployeeDetails abc=new EmployeeDetails();
	System.out.println(abc.Details(20000,5000));
}
}

