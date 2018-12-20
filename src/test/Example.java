package test;

public abstract class Example {
	void m1() {
		System.out.println("m1 method");
	}
	static void m2() {
		System.out.println("m2 method");
	}
	abstract void m3();
	
	public static void main(String[] args) {
		Example.m2();
	}
}
