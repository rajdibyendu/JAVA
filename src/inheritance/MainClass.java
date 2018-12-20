package inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample1 ref1=new Sample1();
		System.out.println("i value is "+ref1.i);
		ref1.disp();
		System.out.println("-----------");
		Sample2 ref2=new Sample2();
		System.out.println("d value is "+ref2.d);
		ref2.demo();
		System.out.println("i value is "+ref2.i);
		ref2.disp();
	}

}
 class Sample1 {
	int i=100;
	public void disp()
	{
		System.out.println("disp running");
	}
}

class Sample2 extends Sample1
{
double d=5.5;
public void demo()
{
	System.out.println("demo running");
}
}

