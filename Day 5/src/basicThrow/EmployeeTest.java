package basicThrow;
/**
 * throw Custom Exception
 * @author suryavanshi
 *
 */

class MyOwnException extends Exception {
	public MyOwnException(String msg){
		super(msg);
	}
}

public class EmployeeTest {
	static void  employeeAge(int age) throws MyOwnException{
		if(age < 0)
			throw new MyOwnException("Age cant be less than zero");
		else
			System.out.println("Input is valid!!");
	}
	public static void main(String[] args) {
		try {
			employeeAge(-2);
		}
		catch (MyOwnException e) {
			e.printStackTrace();
		}
	}
}