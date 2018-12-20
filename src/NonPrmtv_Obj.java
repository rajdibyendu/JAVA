
public class NonPrmtv_Obj {
	public static void dispObject(Sample arg) {
		arg.i=100;
		System.out.println("Inside th dispObject(), i is: "+arg.i);
	}
	public static void main(String[] args) {
		Sample s1=new Sample();
		System.out.println("Before calling dispObject(), i is: "+s1.i);
		dispObject(s1);
		System.out.println("After calling dispArray(), i is: "+s1.i);
	}
}
class Sample{
	int i=20;
}
