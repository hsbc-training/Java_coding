package day4;

import java.util.Comparator;

public class AuthorAgeComparator implements Comparator<Author> {
	public int compare(Author a1, Author a2) {
		return a1.getAuAge()>a2.getAuAge() ? 1 : a1.getAuAge()<a2.getAuAge() ? -1 : 0;
	}
}
