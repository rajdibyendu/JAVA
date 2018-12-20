package methods;

public class Ex4_SameMthdName {
	void m1() {
		System.out.println("m1 method");
	}
	void m1() {
		System.out.println("m1 method");
	}
	int m1() {
		System.out.println("m1 method");
		return 10;
	}
	public static void main(String[] args) {
		Ex4_SameMthdName e1=new Ex4_SameMthdName();
		e1.m1();
	}
}

//Ex4_SameMthdName.java:5: error: method m1() is already defined in class Ex4_Same
//MthdName
//        int m1() {

//two or more methods shoould not have same signature
//Signature= only methodName(Parameter)