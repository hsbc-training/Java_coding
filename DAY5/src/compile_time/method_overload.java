package compile_time;

class method_overload {

	public static void main(String[] args) {
		overload o=new overload();
		double res;
		o.demo(10);
		o.demo(5, 4);
		res=o.demo(5.5);
		System.out.println(""+res);

	}

}
