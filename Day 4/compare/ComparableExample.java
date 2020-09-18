package compare;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample implements Comparable<ComparableExample> {
	private double rating;

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

	private String name;
	private int year;

	public ComparableExample(String name, double rating, int year) {
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	@Override
	public int compareTo(ComparableExample a) {
		return this.year - a.year;
	}
	

	@Override
	public String toString() {
		return "ComparableExample [rating=" + rating + ", name=" + name + ", year=" + year + "]";
	}

	public static void main(String[] args) {
		ArrayList<ComparableExample> list = new ArrayList<ComparableExample>();
		list.add(new ComparableExample("Force Awakens", 8.3, 2015));
		list.add(new ComparableExample("Star Wars", 8.7, 1977));
		list.add(new ComparableExample("Empire Strikes Back", 8.8, 1980));
		list.add(new ComparableExample("Return of the Jedi", 8.4, 1983));
		System.out.println(list);
        Collections.sort(list); 
        System.out.println(list);
	}

}
