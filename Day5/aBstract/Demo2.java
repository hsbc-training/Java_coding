package aBstract;
interface Sum{
	public abstract int sumoftwo(int i,int j);
	public abstract int sumofthree(int i,int j,int k);
}
public class Demo2 implements Sum{
	public int sumoftwo(int i,int j) {
		return i+j;
	}
	public int sumofthree(int i,int j,int k) {
		return i+j+k;
	}
	public static void main(String args[]) {
		Sum s1=new Demo2();
		System.out.println(s1.sumoftwo(2, 3));
		System.out.println(s1.sumofthree(1, 2, 3));
	}
	

}
