package day5;
class MyOwnException extends Exception{
	public MyOwnException(String msg) {
		super(msg);
	}
}
public class ExceptionExample5 {
	static void employeeAge(int age) throws MyOwnException{
		if(age<0)
			throw new MyOwnException("Age cant be less than 0");
		else 
			System.out.println("input is valid");
	}
	
	public static void main(String[] args) {
		try {
			employeeAge(-2);
		} catch(MyOwnException e){
			e.printStackTrace();
		}
	}
}
