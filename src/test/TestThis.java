package test;

public class TestThis {
	int a=10;
	void m1(int a) {
		System.out.println(a);
	}
	void m2(int a) {
		System.out.println(this.a);
		m1(300);
	}
	public static void main(String[] args) {
		new TestThis().m1(100);
		new TestThis().m2(200);
	}
	
}
