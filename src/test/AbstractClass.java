package test;

public abstract class AbstractClass {
	int i=5;
	public void m1() {
		System.out.println("m1");
		i=i+5;
	}
	
	public abstract void m2();
	
	AbstractClass(){
		System.out.println("constructor");
	}
	
	static{
		System.out.println("blocks");
	}
}
