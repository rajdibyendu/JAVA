package static_member;

public class Ex1_SameClass {
	static int i=10;
	static void disp() {
		System.out.println("Disp is running....");
	}
	public static void main(String[] args) {
		System.out.println(i);
		disp();
		
		System.out.println(Ex1_SameClass.i);
		Ex1_SameClass.disp();
	}
}

//static members are called in same class by a) directly b) using class name(ClassName.staticMember)
