package polymorphism;
/**
 * Static Binding
 * @author suryavanshi
 *
 */
class Human{
	public static void walk()
	{
		System.out.println("Human walks");
	}
}
public class Boy extends Human{
	public static void walk(){
		System.out.println("Boy walks");
	}
	public static void main( String args[]) {
		/* Reference is of Human type and object is
		 * Boy type
		 */
		Human obj = new Boy();
		/* Reference is of Human type and object is
		 * of Human type.
		 */
		Human obj2 = new Human();
		obj.walk();
		obj2.walk();
	}
}