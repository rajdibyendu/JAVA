import java.util.*; //5. Package statement must be first statement (Order - package(only 1) >> import(any number) >> class/Interface/Enum
package durgasoft.oops.concept;
package constructor_chaining; //4. only package is allowed for one java class

//1. File name can be anything raj.java, if there are no public class
class A {

}
class B{
	
}
class C{
	
}

//2. File name must be E.java, if there is public class
//And maximum 1 class can have public
class D {

}
public class E{
	
}
class F{
	
}

//3. File name can be anything Raj.java
//multiple main method is allowed
//When compile - javac Raj.java, then 3 java class will be created i.e. G.class, H.class, I.class, not Raj.class
//When run Java G and H, corresponding main method will run
//If you run Java I, you will get error - there is no corresponding main method
//If you run Java Raj, you will get an error - there is no corresponding class
class G {
	public static void main(String[] args) {
		
	}
}

class H{
	public static void main(String[] args) {
		
	}
}

class I{

}
