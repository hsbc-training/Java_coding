
public class GenericsDemo {
	public static < E > void printArray( E[] inputArray ) {
	      // Display array elements
	  for(E element : inputArray) {
	     System.out.printf("%s ", element);
	  }
	  System.out.println();
	}
	 static class Box<T> {
		   private T t;

		   public void add(T t) {
		      this.t = t;
		   }

		   public T get() {
		      return t;
		   }

		}
	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
	     
	  Integer[] intArray = { 1, 2, 3, 4, 5 };
	  Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
	  Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
	
	  System.out.println("Array integerArray contains:");
	  printArray(intArray);  
	
	  System.out.println("\nArray doubleArray contains:");
	  printArray(doubleArray);   
	
	  System.out.println("\nArray characterArray contains:");
	  printArray(charArray);   
	  
	  Box<Integer> integerBox = new Box<Integer>();
      Box<String> stringBox = new Box<String>();
    
      integerBox.add(new Integer(10));
      stringBox.add(new String("Hello World"));

      System.out.printf("Integer Value :%d\n\n", integerBox.get());
      System.out.printf("String Value :%s\n", stringBox.get());
	}
}
