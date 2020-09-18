//import interfaces.inter_class;

public class inter implements Interface1{

	public void help() {
	      System.out.println("Help others");
	   }

	   public void kind() {
	      System.out.println("Be kind");
	   }

	   public static void main(String args[]) {
	      inter i = new inter();
	      i.help();
	      i.kind();
	   }
}
