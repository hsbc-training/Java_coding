package Day2_loopstring;

public class Do_while {
	public static void main(String[] args)
	{
		int x=10;
		do
		{
			System.out.print("value of x" + x );
			
			if(x==11)
				break;
			System.out.print("\n");
			x++;
		}
		while(x<20);
	
	
	int y=10;
	do
	{
		System.out.print("value of y" + y );
		if(y==11)
			continue;
		System.out.print("\n");
		y++;
	}
	while(x<20);
}

}
