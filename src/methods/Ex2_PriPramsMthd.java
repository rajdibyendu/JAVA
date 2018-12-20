package methods;

public class Ex2_PriPramsMthd {
	void m1(int a) {	//instance method
		System.out.println("m1 method");
	}
	static void m2(int a, int b) {	//static method
		System.out.println("m2 method");
	}
	public static void main(String[] args) {
		Ex2_PriPramsMthd e1=new Ex2_PriPramsMthd();	//instance mthd called by creating object
		e1.m1(10);
		
		Ex2_PriPramsMthd.m2(10,20);	//static method called by using class name
	}
}

//For primitive data, we have to pass value during calling
