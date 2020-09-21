package EncapsulationPractice;

class EncapDemo{
    private int ssn;
    private String empName;
    private int empAge;

    //Getter and Setter methods
    public int getEmpSSN(){
        return ssn;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int newValue){
        empAge = newValue;
    }

    public void setEmpName(String newValue){
        empName = newValue;
    }

    public void setEmpSSN(int newValue){
        ssn = newValue;
    }
}

public class EncapsulationDemo {
	public static void main(String[] args) {
		EncapDemo obj = new EncapDemo();
	    obj.setEmpName("Pratham");
	    obj.setEmpAge(21);
	    obj.setEmpSSN(123);
	    System.out.println("Employee Name: " + obj.getEmpName());
	    System.out.println("Employee SSN: " + obj.getEmpSSN());
	    System.out.println("Employee Age: " + obj.getEmpAge());
	}
	
}
