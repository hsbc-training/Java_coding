
public class LOOPANDDECISION {
	public static void main(String args[]){
		int a=10;
		int b=20;
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
	
	String str[] ={"Home","Lunch","Laptop"};
	
	for(String s : str)
		System.out.println(s);
		 
		int x =1;
		do{
			System.out.println(x);
			if(x == 4)
				break;
			x++; 
		}while(x<5);
		
		int y=0;
		do{
			y+=100;
			if(y == 300)
				continue;
			System.out.println(y);
		}while(y<500);
	}
}
