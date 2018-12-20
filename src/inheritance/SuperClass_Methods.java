package inheritance;

class E{
	void m1() {//super class method
		System.out.println("SUPER class method");
	}
}
public class SuperClass_Methods extends E{	
	void m1() {//sub class method
		System.out.println("SUB class method");
	}
	void m2() {
		//m1();//sub
		this.m1();//(optional), if this keyword is not used by default subclass mth called
		
		//m1();//super
		super.m1();//to call super mthd --> use super keyword
	}
	public static void main(String[] args) {
		new SuperClass_Methods().m2();
	}
}
