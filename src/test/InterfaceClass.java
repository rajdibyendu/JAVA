package test;

public interface InterfaceClass {
	
	//2. every variables is public, static and final
	int i=5;	//3. compulsory initialization
	
	//Note: from JDK 1.8, we can write static method
	public static void m1() {	
		System.out.println("m1");
	}
	
	//1. every method is public and abstract
	public void m2();
	
	//4. we cannot declare static or instance block
	//	{
	//		System.out.println("block");
	//	}
	
	//5. we cannot declare constructor
	//	InterfaceClass(){
	//		
	//	}
}	
