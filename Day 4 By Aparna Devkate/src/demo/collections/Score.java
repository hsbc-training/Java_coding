package demo.collections;

public class Score {
	private String name;
	private Integer marks;
	
	public Score(String name,Integer marks) {
		this.name = name;
		this.marks=marks;
	}
	
	public String getName() {
		return name;
	}

	public Integer getMarks() {
		return marks;
	}
	
}
