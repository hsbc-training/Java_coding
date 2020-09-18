package ComparableComparator;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	
	
	    private String studentname;
	    private int rollno;
	    private int studentage;

	    public Student(int rollno, String studentname, int studentage) {
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
		public int compareTo(Student s1) {
			// TODO Auto-generated method stub
			//int rollno = ((Student)s1).getRollno();
			// return this.rollno-rollno
			
			//return (this.studentname).compareTo(((Student)s1).getStudentname());
		
			return ((Student)s1).getStudentage()-this.studentage;
		}

		@Override
		public String toString() {
			return "Student [studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage + "]";
		}
		
		
		public static Comparator<Student> ageComp = new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				int a1 = s1.getStudentage();
				int a2 = s2.getStudentage();
				return a1-a2 ;
			}
		
		
		};
	
		public static Comparator<Student> nameComp = new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				
				return s1.getStudentname().compareTo(s2.getStudentname());
			}
			
		};
		
		
		public static Comparator<Student> rollnoComp = new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				return s1.getRollno()-s2.getRollno();
			}
			
		};
}
