package inheritance;

class H{
	{
		System.out.println("PARENT class ins block");
	}
	H(){
		System.out.println("PARENT class 0-argconsttructor");
	}
	static
	{
		System.out.println("PARENT class static block");
	}
}
public class SuperClass_StaticBlock extends H {
	{
		System.out.println("CHILD class ins block");
	}
	SuperClass_StaticBlock(){
		//super()-->generated by compiler
		System.out.println("CHILD class 0-argconsttructor");
	}
	static
	{
		System.out.println("CHILD class static block");
	}
	public static void main(String[] args) {
		new SuperClass_StaticBlock();
	}
}

//first parent static block and child static block
//then parent ins block and constructor
//then child ins block and constructor

//static block executes only one, no matter how many object is created