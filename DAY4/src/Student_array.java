
public class Student_array implements Comparable<Student_array> {
	 private String studentname;
	 private int rollno;
	 private int studentage;

	    public Student_array(int rollno, String studentname, int studentage) {
	         this.rollno = rollno;
	         this.studentname = studentname;
	         this.studentage = studentage;
	    }

	 public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}
	
	
	@Override
	public int compareTo (Student_array comparestu) {
		int compareage=((Student_array)comparestu).getStudentage();
		return this.studentage-compareage;
		
		/* For Descending order do like this */
        //return compareage-this.studentage; 
	}
	public String toString() {
        return "[ rollno=" + rollno + ", name=" + studentname + ", age=" + studentage + "]";
    }


/*	public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

		public int compare(Student s1, Student s2) {
		   String StudentName1 = s1.getStudentname().toUpperCase();
		   String StudentName2 = s2.getStudentname().toUpperCase();

		   //ascending order
		   return StudentName1.compareTo(StudentName2);

		   //descending order
		   //return StudentName2.compareTo(StudentName1);
	    }}; also import java.util.Comparator*/ 
	
	
	
	 
}
	

