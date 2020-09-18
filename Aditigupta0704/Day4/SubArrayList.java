package Day4;

import java.util.ArrayList;
import java.util.*;
public class SubArrayList {
	public static void main(String[] args)
	{
		ArrayList<String> array=new ArrayList<>();
		array.add("text1");
		array.add("text2");
		array.add("text3");
		array.add("text4");
		array.add("text5");
		

		ArrayList<String> subarray=new ArrayList<>(array.subList(1,3));
		List<String>subarray1=array.subList(1,3);
		System.out.println(subarray);
		System.out.println(subarray1);
		
		
		
}
}
