package corejava;

public class StringOp {
	
	public static void main(String[] args) {
		
		String s1 = "Ambrose",s2="Aparna";
		System.out.println("SAMPLE STRING OPERATIONS IN JAVA\n\n");
		// Length
		System.out.println("Length of "+s1+" is "+s1.length()+
				" Length of "+s2+" is "+s2.length());
		
		//Concat
		System.out.println("Concat of "+s1+" and "+s2+" is : "+s1.concat(s2));;
		
		//Equal
		System.out.println("Equal Op for "+s1+" and "+s2+" is "+s1.equals(s2));
		
		// String Pool
		String str1 = "Ambrose";
		String str2 = "Ambrose";
		String str3 = new String("Ambrose");
		System.out.println("Equal Check With No object creation : ");
		System.out.println(str1==str2);
		System.out.println("Equal Check With Object Creation : ");
		System.out.println(str2==str3);
	}

}
