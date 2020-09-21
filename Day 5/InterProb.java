package beginnerbook2;

interface Group1 {
	int x=10;
	abstract void meth();
}
interface Group2{
	int x=73;
}
class InterProb implements Group1,Group2{
	public void meth() {
		System.out.println("Roman Empire");
	}
	public static void main(String[] args) {
		System.out.println(Group1.x);
		System.out.println(Group2.x);
		InterProb asa=new InterProb();
		asa.meth();
	}
}
