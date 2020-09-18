package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraytoArrayList {

	public static void main(String[] args) {
		String citynames[] = { "Agra", "Mysore", "Chandigarh", "Bhopal" };
		
		ArrayList<String> citylist = new ArrayList<String>(Arrays.asList(citynames));

		citylist.add("New City2");
		citylist.add("New City3");
		
		System.out.println(citylist);
	}

}
