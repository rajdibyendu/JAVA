package non_static_member;

public class DefaultValues {
	public static void main(String[] args) {
		System.out.println(new Sample().s);
		System.out.println(new Sample().i);
		System.out.println(new Sample().f);
		System.out.println(new Sample().d);
		System.out.println(new Sample().l);
		System.out.println(new Sample().ch);
		System.out.println(new Sample().bool);
		System.out.println(new Sample().str);

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
