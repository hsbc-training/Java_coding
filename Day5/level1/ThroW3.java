package level1;
class InvalidProductException extends Exception{
	String s1;

	public InvalidProductException(String s2) {
     s1 = s2;
	}

	@Override
	public String toString() {
		
		return ("Caught the exception"+s1);
	}
	
	
}
public class ThroW3 {
	void productCheck(int weight) throws InvalidProductException{
		if(weight<100){
			throw new InvalidProductException("Product Invalid");
		}
	   }
	 public static void main(String args[])
	    {
	    	ThroW3 obj = new ThroW3();
	        try
	        {
	            obj.productCheck(60);
	        }
	        catch (InvalidProductException ex)
	        {
	           
	            System.out.println(ex.getMessage());
	        }
	    }
	   
}
