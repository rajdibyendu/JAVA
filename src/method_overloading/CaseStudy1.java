package method_overloading;

class A{
	void m1(int i) {
		System.out.println("int-arg method");
	}
	
	void m1(float f) {
		System.out.println("float-arg method");
	}
}

public class CaseStudy1 {

	public static void main(String[] args) {
		
		A a = new A();
		a.m1(10);	//int-arg method
		a.m1(2f);	//float-arg method
		a.m1('a');	//int-arg method - Auto promoted to next data types from char->int
	}

}
//1. Automatic promotion in method overloading
/*
byte --> short --> int --> long --> float --> double
					^
					|
					|
				   char
*/