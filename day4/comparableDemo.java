package day4;

public class comparableDemo implements Comparable<comparableDemo> {
	private String studentName;
	private int rollno;
	private int studentAge;
	public comparableDemo(String studentName, int rollno, int studentAge) {
		super();
		this.studentName = studentName;
		this.rollno = rollno;
		this.studentAge = studentAge;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	@Override
	public int compareTo(comparableDemo arg0) {
		// TODO Auto-generated method stub
		int compareAge = arg0.getStudentAge();
		
		return this.getStudentAge()-compareAge;
	}
		
}
