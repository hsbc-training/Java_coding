package level1;

public class FinaLLy {
public static void main(String[] args) {
	FinaLLy obj=new FinaLLy();
	System.out.println(obj.mymethod());
}
public int mymethod() {
	try {
		return 111;
		//System.exit(0); this does not let pointer enter finally
	}
	//first finally runs and then value is returned
	finally {
		System.out.println("inside finally");
	}
}
}
