package test;

public abstract class AbstractClass {
	
	//2.Can have instance and static variables. Not required to be final.
	int i=5;
	static int j;	//3. Variables need not be initialized.
	
	//1. Can have both abstract and concrete methods. Access modifiers can be public, protected, or private.
	public void m1() {	//concrete method
		System.out.println("m1");
		i=i+5;
	}
	
	public abstract void m2();	//abstract method
	
	//5. constructor allowed
	AbstractClass(){
		System.out.println("constructor");
	}
	
	//4. static or instance blocks allowed
	static{
		System.out.println("blocks");
	}
	
	{
		System.out.println("instance blocks");
	}
}
