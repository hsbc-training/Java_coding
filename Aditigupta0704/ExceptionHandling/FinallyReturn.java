package ExceptionHandling;

public class FinallyReturn {

	public int demo()
	{
		try
		{
			return 1 ;
		}
		finally
		{
		return 9;
		}
	}
	public static void main(String[] args)
	{
		FinallyReturn f=new FinallyReturn();
		System.out.println(f.demo());
	}
}
