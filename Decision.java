package Day2_loopstring;

public class Decision {
	public static void main(String[] args)
	{

	int[] num = {1,2,3,4};
	for(int a:num )
	{
		if(a==3)
			break;
		else
			System.out.print(a);
	}
    System.out.println("\n");
	for (int p:num) {
		if(p==3)
			continue;
		else
			System.out.print(p);
				
	}
}
}
