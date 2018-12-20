package static_member;

class Class1{
	static int i=10;
	static void disp() {
		System.out.println("Disp is running...");
	}
}

public class Ex2_DifferentClass {
	public static void main(String[] args) {
	//	System.out.println(i);
	//	disp();
		
		System.out.println(Class1.i);
		Class1.disp();
		
	}
}
