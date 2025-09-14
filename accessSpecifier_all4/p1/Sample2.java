package p1;

public class Sample2 {
		public static void disp()
		{
			Sample1 ref= new Sample1();
			System.out.println(ref.d);	//default
			System.out.println(ref.c);	//protected
			System.out.println(ref.b);	//public
//			System.out.println(ref.i);	//private
		}
	
}
