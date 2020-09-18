package day4;

public class Author implements Comparable<Author> {
	private String firstName;
	private String bookName;
	private int auAge;
	
	public Author(String firstName, String bookName, int auAge) {
		super();
		this.firstName = firstName;
		this.bookName = bookName;
		this.auAge = auAge;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getAuAge() {
		return auAge;
	}

	public void setAuAge(int auAge) {
		this.auAge = auAge;
	}
	
	@Override
	public int compareTo(Author au) {
		// TODO Auto-generated method stub
		return this.firstName.compareTo(au.firstName);
	}

	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", bookName=" + bookName + ", auAge=" + auAge + "]";
	}
	
	
	
}
