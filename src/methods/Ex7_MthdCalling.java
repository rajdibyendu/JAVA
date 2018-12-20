package methods;

public class Ex7_MthdCalling {
	void m1() {	
		m2();	//instance mthd directly call from instance mthd of same class
		System.out.println("m1 method");
		m2();
	}
	void m2() {
		m3();
		System.out.println("m2 method");
	}
	void m3() {
		System.out.println("m3 method");
	}
	public static void main(String[] args) {
		Ex7_MthdCalling e1=new Ex7_MthdCalling();
		e1.m1();
	}
}
