package comparableandcomparator;
/*
 * @Author Pratham Sharma
 * 
 * Package created to demo comparable and comparator
 * 
 * Class Student for implementing the concept
 */

public class Student implements Comparable<Student>{
	
	private String studentName;
	private int rollNumber;
	private int studentAge;
	
	
	public Student(String studentName, int rollNumber, int studentAge) {
		super();
		this.studentName = studentName;
		this.rollNumber = rollNumber;
		this.studentAge = studentAge;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	

	
	
	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "[ rollno=" + rollNumber + ", name=" + studentName + ", age=" + studentAge + "]";
		}
	
	@Override
	public int compareTo(Student comparesto) {
		int compareAge = ((Student)comparesto).getStudentAge();
		return this.studentAge-compareAge;

	}
}
