package oops;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char helloArray[] = {'h','e','l','l','o'};
		String helloString = new String(helloArray);
		System.out.println(helloString);
		
		String palindrome= "Dot saw I was Tod";
		System.out.println(palindrome.length());
		
		System.out.println("Hello".concat("World"));
		
		String fs = String.format("Value of float is %f, while integer is %d", 1.2F,45);
		System.out.print(fs);

	}

}
