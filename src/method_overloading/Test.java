package method_overloading;

public class Test {
	public static void main(String[] args) {
		System.out.println("MAIN METHOD");
		Test t=new Test();
		t.main(34);
	}
	void main(int i) {
		System.out.println("SECOND METHOD "+i);
	}
	void m1() {
		System.out.println("m1");
	}
}
