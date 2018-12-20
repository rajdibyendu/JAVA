package constructor;

public class Ex1_DefaultConstructor {
	public static void main(String[] args) {
		Sample1 s1=new Sample1();
		s1.disp();
	}
}

class Sample1{
	void disp() {						//non static method
		System.out.println("Disp is running...");
	}
/*	
 	Sample(){						//Default Constructor
 	}
	
*/	

}
//What is the difference between a constructor and a method?
//
//1.Constructors create and initialize objects that don't exist yet, while methods
//perform operations on objects that already exist.
//
//2.Constructors can't be called directly; they are called implicitly when the new
//keyword creates an object. Methods can be called directly on an object that has
//already been created with new keyword.
//
//3.Constructors must be named with the same name as the class name. They can't return
//anything, even void (the object itself is the implicit return). Methods must be
//declared to return something, although it can be void.