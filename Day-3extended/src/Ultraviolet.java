
public class Ultraviolet {
	  public static void main(String[] args) {
		    short s1 = 1;        //1
		    char c1 = 1;         //2
		  /*  byte b1 = s1;        //3
		    byte b2 = c1;        //4
*/		    final short s2 = 1;  //5
		    final char c2 = 1;   //6
		    byte b3 = s2;        //7
		    byte b4 = c2;        //8
		    System.out.println(c1);
		}
}
