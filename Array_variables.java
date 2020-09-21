
public class Array_variables {
	public static void main(String args[])
	{
double[] myList= {10.9,20.7,50.6};
for(int i=0; i<myList.length; i++) {
System.out.print(myList[i]+ " ");
}
double sum=0;
for(double element:myList) {
	
sum+=element;

}
System.out.println();
System.out.println("sum is "+ sum);
}
}
