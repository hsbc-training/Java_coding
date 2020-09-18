package day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemoDriver {
	public static void main(String[] args) {
		ArrayList<comparableDemo> al = new ArrayList<comparableDemo>();
		al.add(new comparableDemo("Akash", 23, 23));
		al.add(new comparableDemo("Ankush", 24, 22));
		al.add(new comparableDemo("Bharat", 25, 21));
		
		Collections.sort(al,Collections.reverseOrder());
		for (comparableDemo string : al) {
			System.out.println(string.getStudentName());
		}
	}
}
