package test;

public class InterfaceImp implements InterfaceClass{
	public static void main(String[] args) {
		InterfaceClass.m1();
		InterfaceImp imp = new InterfaceImp();
					 imp.m2();
		System.out.println(i*5);
	}
	public void m2() {
		System.out.println("M2");		
	}
}
