package day3;

public class RunEncap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapTest encap = new EncapTest();
		encap.setAge(20);
		encap.setIdNum("1234ms");
		encap.setName("James");
		
		System.out.println("Name: "+encap.getName()+" Age: "+ encap.getAge() + " Id Number: "+encap.getIdNum());
	}

}
