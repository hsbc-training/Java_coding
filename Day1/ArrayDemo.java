package Day1;

public class ArrayDemo {
public static void main(String args[]) {
	double[] arr= {1.9,2.9,3.9,4.9};
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	System.out.println("total is "+sum);
	
    
    
    double max = arr[0];
    for (int i = 1; i < arr.length; i++) {
       if (arr[i] > max)
    	   max = arr[i];
    }
    System.out.println("Max is " + max);  
 }

}  

