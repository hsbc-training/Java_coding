package java_b;

public class Student implements java.io.Serializable{
	private int stuRollnumber;
	private String stuName;
	private int stuAge;
	private transient int  stuHeight;
	private transient String stuAddress;
	
	public Student(int stuRollnumber, int stuAge, String stuName,  String stuAddress, int stuHeight) {
		super();
		this.stuRollnumber = stuRollnumber;
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuHeight = stuHeight;
		this.stuAddress = stuAddress;
	}
	public int getStuRollnumber() {
		return stuRollnumber;
	}
	public void setStuRollnumber(int stuRollnumber) {
		this.stuRollnumber = stuRollnumber;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public int getStuHeight() {
		return stuHeight;
	}
	public void setStuHeight(int stuHeight) {
		this.stuHeight = stuHeight;
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

}
