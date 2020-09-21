package java_b;

class XYZ1 {
	final void demo() {
		System.out.println("XYZ Class Method");
	}
}

class ABC1 extends XYZ1 {
	static final int ROLL_NO;
	static {
		ROLL_NO = 1230;
	}

	public static void main(String args[]) {
		ABC1 obj = new ABC1();
		obj.demo();
	}
}
