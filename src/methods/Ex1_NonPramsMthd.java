package methods;

public class Ex1_NonPramsMthd {
	void m1() {	//instance method
		System.out.println("m1 method");
	}
	static void m2() {	//static method
		System.out.println("m2 method");
	}
	public static void main(String[] args) {
		Ex1_NonPramsMthd e1=new Ex1_NonPramsMthd();	//instance mthd called by creating object
		e1.m1();
		
		Ex1_NonPramsMthd.m2();	//static method called by using class name
	}
}
