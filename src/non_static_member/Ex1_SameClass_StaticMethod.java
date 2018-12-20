package non_static_member;

public class Ex1_SameClass_StaticMethod {
	int i=10;											//non static member
	void disp() {										//non static member
		System.out.println("Disp is running...");
	}
	public static void main(String[] args) {			//static method
	//	System.out.println(i);
	//	disp();
		
		System.out.println(new Ex1_SameClass_StaticMethod().i);
		new Ex1_SameClass_StaticMethod().disp();
	}
}
