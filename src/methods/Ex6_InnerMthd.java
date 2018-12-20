package methods;

public class Ex6_InnerMthd {
	void m1() {
		System.out.println("m1 method");
		void m2() {	
			System.out.println("m2 method");
		}
	}
	public static void main(String[] args) {
		Ex6_InnerMthd e1=new Ex6_InnerMthd();
		e1.m1();
	}
	
}

//COMPILE TIME ERROR 
//Ex6_InnerMthd.java:4: error: illegal start of expression
//void m2() {