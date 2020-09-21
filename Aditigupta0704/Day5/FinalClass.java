package Day5;
/**
 * 
 * @author ADITI GUPTA
 * A final class cannot be extended
 *
 */
//final class FinalClass1 {
class FinalClass1
{
	public void show()
	{
		System.out.println("In parent");
	}
}
public class FinalClass extends FinalClass1
{
	public static void main(String[] args)
	{
		FinalClass c=new FinalClass();
		c.show();
	}
}

