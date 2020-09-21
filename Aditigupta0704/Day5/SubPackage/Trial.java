package Day5.SubPackage;

import Day5.*;
public class Trial extends ParentTrail {

	public void show()
	{
		System.out.println("In subpackage class show");
	}
	public static void main(String [] args)
	{
		Trial t=new Trial();
		t.display();
	}
	
}
