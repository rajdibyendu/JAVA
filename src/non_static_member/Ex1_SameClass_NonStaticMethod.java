package non_static_member;

public class Ex1_SameClass_NonStaticMethod {
	int i=10;									//non static member
	void disp() {								//non static member
		System.out.println("Disp is running...");
	}
	
	void nonStaticMethod() {					//non static method
		System.out.println(i);					//directly call non static member in non static method
		disp();
	}
	public static void main(String[] args) {
		new Ex1_SameClass_NonStaticMethod().nonStaticMethod();
	}
}
