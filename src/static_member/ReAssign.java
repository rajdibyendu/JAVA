package static_member;

public class ReAssign {
	static int i1;
	public static void main(String[] args) {
		System.out.println(i1);
		i1=10;
		System.out.println(i1);
		
		System.out.println("----------");
		
		System.out.println(Sample1.b);
		System.out.println(Sample1.s);
		System.out.println(Sample1.i);
		System.out.println(Sample1.f);
		System.out.println(Sample1.d);
		System.out.println(Sample1.l);
		System.out.println(Sample1.ch);
		System.out.println(Sample1.bool);
		System.out.println(Sample1.str);
		
		System.out.println("-------");
		
		Sample1.i=5;
		Sample1.f=2.3f;
		Sample1.str= "raj";
		System.out.println(Sample1.i);
		System.out.println(Sample1.f);
		System.out.println(Sample1.str);
	}
}

class Sample1{
	static byte b;
	static short s;
	static int i;
	static float f;
	static double d;
	static long l;
	static char ch;
	static boolean bool;
	static String str;
}
