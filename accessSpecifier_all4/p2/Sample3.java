package p2;
import p1.Sample1;
public class Sample3 extends Sample1 
{
	public void test()
	{
		System.out.println(c);	//protected (allowed in different package via inheritence)
		System.out.println(b);	//public
//		System.out.println(i);	//private
//		System.out.println(d);	//default
	}
}

class Sample4
{
	public void test()
	{
		Sample1 s = new Sample1();
//		System.out.println(s.c);	//protected (not allowed outside the package)
		System.out.println(s.b);	//public
//		System.out.println(s.i);	//private
//		System.out.println(s.d);	//default
	}
}

