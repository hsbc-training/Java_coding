
public class Arrays {
	public static void main(String [] args) {
		int [] numbers = {2,4,6,8,10};
		int len= numbers.length;
		int count=0;
		for (int num : numbers) {
			if(num%2==0) {
				count++;
			}
		}
		if(count==len) {
			System.out.println("All numbers in array are multiples of 2");
		}
		else {
			System.out.println("Only " + count + "of" + len +"are multiples of 2");
		}
	}
}
