package method_overloading;

public class Ex1 {
	void m1(int a) {
		System.out.println("int m1 method");
	}
	void m1(int a, int b) {
		System.out.println("int,int m1 method");
	}
	void m1(char ch) {
		System.out.println("char m1 method");
	}
	public static void main(String[] args) {
		Ex1 e = new Ex1();
		e.m1(10);		//this mapping is done at compile time, because when pass 
		e.m1(10, 20);	//one integer value then compiler will decide which method 
		e.m1('a');		//to be executed. Similarly, if we pass char value then
	}					//compiler will decide the last method to be executed
}
