package p1;

public class Student {
	private String studentName;
	private int studentRollNo;
	private int studentAge;
	
	public Student(String studentName, int studentRollNo, int studentAge) {
		super();
		this.studentName = studentName;
		this.studentRollNo = studentRollNo;
		this.studentAge = studentAge;
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentRollNo() {
		return studentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		this.studentRollNo = studentRollNo;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

}
