package static_member;

public class DefaultValues {
	static int i1;
	public static void main(String[] args) {
		System.out.println(i1);
		
		System.out.println("----------");
		
		System.out.println(Sample.b);
		System.out.println(Sample.s);
		System.out.println(Sample.i);
		System.out.println(Sample.f);
		System.out.println(Sample.d);
		System.out.println(Sample.l);
		System.out.println(Sample.ch);
		System.out.println(Sample.bool);
		System.out.println(Sample.str);
	}
}

class Sample{
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
