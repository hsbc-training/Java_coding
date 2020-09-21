

class InvalidProductException extends Exception{

	public InvalidProductException(String s)
	{
		super(s);
	}
}

public class UserException {

	void productCheck(int weight)throws InvalidProductException
	{
		if(weight<100)
		{
			throw new InvalidProductException("Product invalid");
		}
	}
	public static void main(String[] args) {
		UserException obj=new UserException();
		try {
			obj.productCheck(60);
		}catch(InvalidProductException ex){
			System.out.println("Caught exception");
			System.out.println(ex.getLocalizedMessage());
		}
	
}
}