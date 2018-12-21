package test;

public class AbstractImp extends AbstractClass{
	public static void main(String[] args) {
		new AbstractImp().m1();
		new AbstractImp().m2();
	}
	public void m2() {
		System.out.println("m2");
	}
}
