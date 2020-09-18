package day4;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Author> al = new ArrayList<>();
		 al.add(new Author("Henry", "Tropic of Cancer",  45));
	     al.add(new Author("Nalo", "Brown Girl in the Ring", 56));
	     al.add(new Author("Frank", "300", 65));
	     al.add(new Author("Deborah", "Sky Boys", 51));
	     al.add(new Author("George R. R.", "A Song of Ice and Fire", 62));
	     
	     System.out.println("Sorting by Author first name");
	     Collections.sort(al);
	     System.out.println(al);
	     
	     System.out.println("Sorting by Author age");
	     Collections.sort(al, new AuthorAgeComparator());
	     System.out.println(al);
	     
	     System.out.println("Sorting by Book name");
	     Collections.sort(al, new BookNameComparator());
	     System.out.println(al);
	}

}
