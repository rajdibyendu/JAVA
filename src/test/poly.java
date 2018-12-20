package test;

abstract class Abstract{
	static void m1() {
		System.out.println("m1 method");
	}
	abstract void m2();
}

public class poly extends Abstract {
	public static void main(String a[]) {
		Abstract.m1();
	}
	void m2() {
		System.out.println("m2 method");
	}
}
