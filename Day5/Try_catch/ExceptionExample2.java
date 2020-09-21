package try_catch;
class InvalidProductException extends Exception{

	public InvalidProductException(String s) {
		super(s);
		}
	
}
public class ExceptionExample2 {
	void productCheck(int weight) throws InvalidProductException{
		if(weight<100) {
			throw new InvalidProductException("Product Invalid");
		}
	}
	public static void main(String[] args) {
		ExceptionExample2 obj= new ExceptionExample2();
		try {
			obj.productCheck(60);
		}
		catch(InvalidProductException ex) {
			System.out.println("Caught the exception");
			System.out.println(ex.getMessage());
		}
		
	}

}
