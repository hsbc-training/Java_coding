package p1;

public class Array {
	/*
	 double[] myList;   // preferred way.
	or
	double myList[];   // works but not preferred way.
	why????????????
	*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {23, 60, 22, 54, 77, 10, 8 , 70}; 
		for( int x : list) {            //advanced for loop
			System.out.println(x);
		}
		
		int max= list[0];
		for(int x:list) {
			if(x>max) {
				max=x; 
			}
		}
		System.out.println("largest elemet is "+ max); //largest element

	}

}
