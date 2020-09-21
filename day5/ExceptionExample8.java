package day5;
class InvalidProductException extends Exception{
	public InvalidProductException(String s) {
	super(s);
	}
}
public class ExceptionExample8 {
	void productCheck(int weight) throws InvalidProductException{
		if (weight<100) {
			throw new InvalidProductException("Product  invalid");
		}
	}
	
	public static void main(String[] args) {
		ExceptionExample8 obj = new ExceptionExample8();
		try {
			obj.productCheck(60);
		} catch(InvalidProductException er){
			System.out.println("Caught the exception");
			System.out.println(er.getMessage());
		}
	}
}
