package normal;

public class Finals {
final int value;
static int roms;
static {
	roms=999;
	System.out.println(roms);
}
Finals(int a) {
	//value=88;
	value=a;
}
void print() {
	System.out.println("The final value is "+value);
}
public static void main(String[] args) {
	Finals ob=new Finals(55);
	ob.print();
	System.out.println(Finals.roms);
}
}
