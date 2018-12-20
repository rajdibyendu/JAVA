package test;

public class static_members {
static int i=10;
static void disp()
{
	System.out.println("static variables and static method");
}
public static void main(String[] args) {
	System.out.println(i); //call static variables from [same class,static method] (direct)
	disp(); //call static methods from [same class,static method] (direct)
	System.out.println(static_members.i); //call static variables from [same class,static method] (syntax)
	static_members.disp(); //call static methods from [same class,static method] (syntax)
	static_members ref=new static_members();//call non-static method
	ref.demo();
	System.out.println("---------------------------");
	//System.out.println(d); can't call static var. directly from [other class,static methd]
	System.out.println(Sample2.d); //call static var. from [other class,static methd] using syntax
	//disp2(); can't call static methd directly from [other class,static methd]
	Sample2.disp2(); //call static methd directly from [other class,static methd] using syntax
}
public void demo() 
{
	System.out.println(i); //call static variables from [same class,non-static method] (direct)
	System.out.println(static_members.i); //call static variables from [same class,non-static method] (syntax)
	disp(); //call static method from [same class,non-static method] (direct)
	static_members.disp(); //call static method from [same class,non-static method] (syntax)
	//disp2(); can't call static methd directly from [other class,non-static methd]
	Sample2.disp2(); //call static methd from [other class,non-static methd] using syntax
}
}
class Sample2
{
	static double d=2.2;
	static void disp2()
	{
		System.out.println("static var and methd of second class");
	}
}
