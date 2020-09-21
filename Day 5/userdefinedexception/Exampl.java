package userdefinedexception;
class InvalidProductException extends Exception
{
    public InvalidProductException(String s)
    {
        super(s);
    }
}
 
public class Exampl
{
   void productCheck(int weight) throws InvalidProductException{
	if(weight<100){
		throw new InvalidProductException("Product Invalid");
	}
   }
   
    public static void main(String args[])
    {
    	Exampl obj = new Exampl();
        try
        {
            obj.productCheck(60);
        }
        catch (InvalidProductException ex)
        {
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }
    }
}