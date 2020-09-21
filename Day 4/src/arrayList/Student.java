package arrayList;

public class Student implements Comparable<Student>{
	private String studentName;
	private int rollNo;
	private int studentAge;

	public Student(String studentName, int rollNo, int studentAge) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.studentAge = studentAge;
	}

	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getStudentAge() {
		return studentAge;
	}
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public int compareTo(Student student) { 
		int compareAge = ((Student)	student).getStudentAge();
		return this.studentAge-compareAge; 
		
		//Descending Order
        //return compareage-this.studentage;
	}

	@Override
	public String toString() {
		return "[ rollno=" + rollNo + ", name=" + studentName + ", age=" + studentAge + "]";
	}

}
