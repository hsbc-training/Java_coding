package exception_handling;

/* This is my Exception class, I have named it MyException
 * you can give any name, just remember that it should
 * extend Exception class
 */
class Example1 extends Exception{
   String str1;
   /* Constructor of custom exception class
    * here I am copying the message that we are passing while
    * throwing the exception to a string and then displaying 
    * that string along with the message.
    */
   Example1(String str2) {
	str1=str2;
   }
   public String toString(){ 
	return ("MyException Occurred: "+str1) ;
   }
}

class MyException{
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