package day3;
public class RunEncap {

   public static void main(String args[]) {
      EncapTest encap = new EncapTest();
      encap.setName("Rohan");
      encap.setAge(22);
      encap.setIdNum("12345678");

      System.out.print("Name : " + encap.getName() + "\nAge : " + encap.getAge() + "\nID : " + encap.getIdNum());
   }
}