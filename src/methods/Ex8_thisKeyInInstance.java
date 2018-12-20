package methods;

public class Ex8_thisKeyInInstance {
	//instance variables
	int a=1000;
	int b=2000;
	void sum(int a, int b) {//local variables
		System.out.println(a+b);//local output
		System.out.println(this.a+this.b);//instance output
	}
	public static void main(String[] args) {
		Ex8_thisKeyInInstance e1=new Ex8_thisKeyInInstance();
		e1.sum(10,20);
	}
}
