

public class Arraydemo {
	public static void main(String[] args) {
		int[] numbers=new int[4];
		numbers[0]=10;
		numbers[2]=20;
		
	
		//System.out.println(names[0]);
		createnames();
	}

	private static void createnames() {
		// TODO Auto-generated method stub
		String[] names=new String[10];
		for (int i = 0; i < names.length; i++) {
			names[i]="Ram"+i;
		}
		//System.out.println(names);
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}
	

}

