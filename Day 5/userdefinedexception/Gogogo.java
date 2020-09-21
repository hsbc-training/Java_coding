package userdefinedexception;

class Example1 extends Exception {
String str1;
Example1(String str2){
	str1=str2;
}
public String toString() {
	return("My exception occured"+str1);
}
}

class Gogogo{
	public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new Example1("This is My error Message");
		}
		catch(Example1 exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
}