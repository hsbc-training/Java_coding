import java.util.Comparator;

public class student{
	private String name;
	private int rollcall;
	private int age;
	public student(int rollcall, String name, int age) {
		this.rollcall = rollcall;
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollcall() {
		return rollcall;
	}
	public void setRollcall(int rollcall) {
		this.rollcall = rollcall;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static Comparator<student> nameCompare = new Comparator<student>() {
		public int compare(student s1, student s2)
		{
			String name1 = s1.getName().toUpperCase();
			String name2 = s2.getName().toUpperCase();
			return name1.compareTo(name2);
		}
	};
	public static Comparator<student> StuRollno = new Comparator<student>() {

		public int compare(student s1, student s2) {

		   int rollno1 = s1.getRollcall();
		   int rollno2 = s2.getRollcall();
		   return rollno1-rollno2;

	   }};
	   public static Comparator<student> compareAge = new Comparator<student>() {

			public int compare(student s1, student s2) {

			   int age1 = s1.getAge();
			   int age2 = s2.getAge();
			   return age1-age2;
		   }};
	    @Override
	    public String toString() {
	        return rollcall + " " + name + " " + age;
	    }

}
