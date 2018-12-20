package method_chaining;

public class Ex1 {
	String m1() {
		System.out.println("m1 method");
		String str=new String("ram");
		return str;
	}
	public static void main(String[] args) {
		Ex1 e=new Ex1();
		e.m1().equals("ram");
	}
}
