package abstraction;

public abstract class Abstract_method {
  private String name;
  private String address;
  private int number;

  
public Abstract_method(String name,String address,int number)
  {
	  System.out.println("Constructing an employee");
	  this.name=name;
	  this.address=address;
	  this.number=number;
  }
  
public double computePay() 
  {
	     System.out.println("Inside Employee computePay");
	     return 0.0;
  }
  
  public void mailcheck()
  {
	  System.out.println("Mailing a check to"+this.name+" "+this.address);
  }
  
  public String toString() {
      return name + " " + address + " " + number;
   }
  
  public String getName() {
		return name;
	}
  
  public int getNumber() {
		return number;
	}
  
  public String getAddress() {
		return address;
	}
  
	public void setAddress(String address) {
		this.address = address;
	}
}
