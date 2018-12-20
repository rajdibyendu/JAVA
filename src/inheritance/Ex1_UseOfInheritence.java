package inheritance;

public class Ex1_UseOfInheritence {}

//Application without inheritance
class A{
	void m1() {}
	void m2() {}
}
class B{
	void m1() {}	//code is duplicated/code redundancy
	void m2() {}	//code is duplicated/code redundancy
	void m3() {}
	void m4() {}
}
class c{
	void m1() {}	//code is duplicated/code redundancy
	void m2() {}	//code is duplicated/code redundancy
	void m3() {}	//code is duplicated/code redundancy
	void m4() {}	//code is duplicated/code redundancy
	void m5() {}
	void m6() {}
}
//DISADVANTAGES
//-------------
//1. code redundancy
//2. length of the code increases


//Application with Inheritance
class A{			//super class
	void m1() {}
	void m2() {}
}
class B extends A{	//sub class
	void m3() {}
	void m4() {}
}
class c extends B{	//sub class
	void m5() {}
	void m6() {}
}

//ADVANTAGES
//----------
//1. code redundancy is reduced/code reusability
//2. length of the code is reduced



//NOTES
//------
//1.class A extends Object{
//		void m1() {}
//		void m2() {}
//}
//class B extends A{
//		void m3() {}
//		void m4() {}
//}
//class c extends B{
//		void m5() {}
//		void m6() {}
//}
//if you not extends a class then the class by default extend object class

//2.The root class of all java class is object Ex: class C>class B>class A> class Object

//3. Every class in java is a subclass of object (directly or indirectly)
//   Ex:class A-->directly, class B and C---> indirectly

//4. Object class is present in java.lang package

//5. One java class can extends only one class(class C extends A,B--> Not possible)

//6. There are 5 types of Inheritance
//	a) Single level
//	b) Multi level
//	c) Hierarchy
//	d) Multiple
//	5) Hybrid (Multiple+Hierarchy)
// Java supports only 3 types of inheritance a,b,c

//7. final class cannot be inherited
//	Ex: final class A{}
//		class B extends A --> not possible
// but final class can extends other class