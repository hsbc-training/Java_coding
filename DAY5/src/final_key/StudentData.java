package final_key;

class StudentData {
		   //Blank final variable
		   final int ROLL_NO;
		   static final int ROLL;
		   static{ 
		      ROLL=1230;
		   }  
		   
		     
		   StudentData(int rnum){
		      //It must be initialized in constructor
		      ROLL_NO=rnum;
		   }
		   void myMethod(){  
		      System.out.println("Roll no is:"+ROLL_NO);
		   }  
		   public static void main(String args[]){  
		      StudentData obj=new  StudentData(1234);  
		      obj.myMethod();  
		      System.out.println("Static final variable:"+StudentData.ROLL);
		   }  
		
}
