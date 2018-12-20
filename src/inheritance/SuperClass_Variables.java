package inheritance;

class D{
	int a=10;	//super class var
	int b=20;
}
public class SuperClass_Variables extends D {
	int a=100;	//current var
	int b=200;
	void add(int a, int b) {//local variables has high priority
		
		System.out.println(a+b);	//local
		
		//System.out.println(a+b);	//current
		System.out.println(this.a+this.b); 	//for current var--> use this keyword
		
		//System.out.println(a+b);	//super
		System.out.println(super.a+super.b);	//for super var--> use super keyword
	}
	public static void main(String[] args) {
		new SuperClass_Variables().add(1000, 2000);
	}
}
