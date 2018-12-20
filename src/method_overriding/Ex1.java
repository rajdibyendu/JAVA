package method_overriding;

public class Ex1 {
	public static void main(String[] args) {
		Child c=new Child();
		c.m1();
	}
}
class Parent{
	void m1() {
		System.out.println("m1 of Ex1");
	}
	
}
class Child extends Parent{
	void m1() {
		System.out.println("m1 of child");
	}
}
