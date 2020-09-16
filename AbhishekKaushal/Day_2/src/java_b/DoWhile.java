package java_b;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		do {
			System.out.print("x:"+x);
			if(x==12)
				break;
			x++;
			System.out.println();
		}
		while(x<20);
		
		
		int []numbers= {10,20,30,40,50};
		for(int c : numbers)
		{
			if(c==30)
			{
				continue;
			}
			System.out.print(c+" ");
			System.out.println();
		}
		
	}

}
