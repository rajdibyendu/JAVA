package inheritance;

class F{
	F(){
		System.out.println("SUPER class 0-arg Constructor");
	}
}
public class SuperClass_Constructors extends F{
	SuperClass_Constructors() {
		this(10);
		System.out.println("SUB class 0-arg Constructor");
	}
	SuperClass_Constructors(int a) {
		super(); 	//if we not write super(), compiler will add super() by default
		System.out.println("SUB class 1-arg Constructor");
	}
	public static void main(String[] args) {
		new SuperClass_Constructors();
	}
}

//1. If we not write this() or super(), then constructor will by default write super()
//	in the first line of constructor.

// 2. So, super class must have 0-arg constructor(either by deault or user defined 0-arg)
//	, otherwise compiler error displayed.

//3. Ex: class Parent
//		 {	Parent()
//		 	{	SOP("Parent class 0-arg constructors");
//			}
//		 }
//		 class Child extends Parent
//		 {	//constructor is generated by compiler
//			//super()--> super is also called by compiler
//		 }
//		 psvm(string args){
//			new child();
//		 }

//OUTPUT
//------
//Parent class 0-arg constructors
