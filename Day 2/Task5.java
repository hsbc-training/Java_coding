
public class Task5 {
	public static void main(String[] args) {
	      double[] myList = {3.3, 8.9, 7.4, 1.5};
	      for (double element: myList) {
	         System.out.println(element);
	      }
	      double total=0;
	      for(int i=0;i<myList.length;i++) {
	    	  total+=myList[i];
	      }
	      System.out.println("Total is : " + total);
	      double max=myList[0];
	      for(int i=1;i<myList.length;i++) {
	    	  if(myList[i]>max)max=myList[i];
	      }
	      System.out.println("Maximum is: "+max);
}
}
