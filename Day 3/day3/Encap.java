package day3;

public class Encap {
	
	private String name;
	private String idNum;
	private int age;
	
//	public Encap(String name, String idNum, int age) {
//		this.name = name;
//		this.idNum = idNum;
//		this.age = age;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	   
	public static void main(String[] args) {
		Encap enc = new Encap();
		enc.setAge(5);
		enc.setIdNum("1");
		enc.setName("Kshitij");
	}

}
