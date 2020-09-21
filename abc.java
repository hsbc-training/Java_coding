
public class abc {
	public void myMethod()
	{
		System.out.println("overridden method");
	}
}
class xyz extends abc{
	public void myMethod()
	{
		System.out.println("overridden method");
	}
	public static void main(String[] args) {
		abc x = new xyz();
		x.myMethod();
		//xyz y = new abc(); -->
		/*
		 * this gives an error because cant instantiate 
		 * parent class using child class
		 */
		
	}
}
/*
 * runtime polymorphism type of object decides which method is to be
 * executed, this this is decided at runtime
 */
