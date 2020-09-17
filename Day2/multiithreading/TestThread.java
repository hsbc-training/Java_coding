package threading;


	public class TestThread {

		   public static void main(String args[]) {
		      ThreadDemo2 T1 = new ThreadDemo2( "Thread-1");
		      T1.start();
		      
		      ThreadDemo2 T2 = new ThreadDemo2( "Thread-2");
		      T2.start();
		   }   
		}

