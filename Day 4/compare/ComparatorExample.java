package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ComparatorExample implements Comparable<ComparatorExample> {
	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	private double rating;
	private String name;
	private int year;

	public ComparatorExample(String name,double rating, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	@Override
	public int compareTo(ComparatorExample o) {
		return this.year - o.year;
	}
	
	public static void main(String[] args) {
		ArrayList<ComparatorExample> list = new ArrayList<ComparatorExample>(); 
        list.add(new ComparatorExample("Force Awakens", 8.3, 2015)); 
        list.add(new ComparatorExample("Star Wars", 8.7, 1977)); 
        list.add(new ComparatorExample("Empire Strikes Back", 8.8, 1980)); 
        list.add(new ComparatorExample("Return of the Jedi", 8.4, 1983)); 
        
        System.out.println("Sorted by Rating");
        RatingCompare rc = new RatingCompare();
        Collections.sort(list, rc);
        
        for(ComparatorExample c : list) {
        	System.out.println(c.getName() + " " + c.getRating() + " " + c.getYear());
        }
        
        System.out.println("Sorted by Name");
        NameCompare nc = new NameCompare();
        Collections.sort(list, nc);
        
        for(ComparatorExample c : list) {
        	System.out.println(c.getName() + " " + c.getRating() + " " + c.getYear());
        }
        
        System.out.println("Sorted by Year");
        Collections.sort(list);
        
        for(ComparatorExample c : list) {
        	System.out.println(c.getName() + " " + c.getRating() + " " + c.getYear());
        }
	}



}

class RatingCompare implements Comparator<ComparatorExample> {

	@Override
	public int compare(ComparatorExample arg0, ComparatorExample arg1) {
		if(arg0.getRating() < arg1.getRating()) return -1;
		if(arg0.getRating() > arg1.getRating()) return 1;
		else return 0;
	}
	
}

class NameCompare implements Comparator<ComparatorExample>{

	@Override
	public int compare(ComparatorExample m1, ComparatorExample m2) {
		return m1.getName().compareTo(m2.getName());
	}
	
}


	