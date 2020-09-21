package serialization;

public class Student implements java.io.Serializable {
	
	public Student(int roll, int age, String name, String address, int height) {
	    this.stuRoll = roll;
	    this.stuAge = age;
	    this.stuName = name;
	    this.stuAddress = address;
	    this.stuHeight = height;
	  }

	
	private int stuRoll;
	public int getStuRoll() {
		return stuRoll;
	}

	public void setStuRoll(int stuRoll) {
		this.stuRoll = stuRoll;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	public int getStuHeight() {
		return stuHeight;
	}

	public void setStuHeight(int stuHeight) {
		this.stuHeight = stuHeight;
	}

	private int stuAge;
	private String stuName;
	private transient String stuAddress;
	private transient int stuHeight;
	
	 	 
	 

}
