package abstraction;

class Sample1
{
	public void disp() //non-static method
	{
		System.out.println("disp of sample1");
	}
}
abstract class Sample2 extends Sample1
{
	abstract void demo(); //abstract method
}
class Sample3 extends Sample2
{
	void demo()
	{
		System.out.println("changed implementation in sample2 abstract method");
	}
	static void test() //static method
	{
		System.out.println("test of sample3");
	}
}
public class Single_inheritence {
	public static void main(String[] args) {
		Sample3.test();
		Sample3 ref=new Sample3();
		ref.demo();
		ref.disp();
		
	}

}
