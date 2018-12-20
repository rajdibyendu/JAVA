package non_static_member;

public class ReAssign {
	public static void main(String[] args) {
		System.out.println(new Sample1().i);	//create new object with i=100
		new Sample1().i=200;					//create new object and assign i=200
		System.out.println(new Sample1().i);	//again create new object with i=100
		new Sample1().i=300;					//create new object and assign i=300
		System.out.println(new Sample1().i);	//again create new object with i=100
		
		System.out.println("--------");
		
		//to avoid these problem save the object using variable called reerence variable
		Sample1 s=new Sample1();
		System.out.println(s.i);
		s.i=200;
		System.out.println(s.i);
		s.i=300;
		System.out.println(s.i);
	}
}

class Sample1{
	int i=100;
}
