package method_chaining;

class A{
	B m1() {
		System.out.println("m1 method");
		return new B();
	}
}
class B{
	Ex2 m2() {
		System.out.println("m2 method");
		return new Ex2();
	}
}

public class Ex2 {
	void m3() {
		System.out.println("m3 method");
	}
	public static void main(String[] args) {
		A a=new A();
		a.m1().m2().m3();
	}
}
