package inheritance;


final class Demo{
	void m1() {
		System.out.println("m1 of demo");
	}
}
public class Sample{
	void m1() {
		System.out.println("m1 of Sample");
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		d.m1();
	}
}
