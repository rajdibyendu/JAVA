package arrays;

public class Ex6_Arg_Rtype_Method {
	
	int[] m1() {
		System.out.println("m1 method");
		int [] arr= {1, 3, 5 ,8};
		return arr;
	}
	
	void m2(int[] arg) {
		System.out.println("m2 method");
		for(int i:arg)
			System.out.println(i);
	}
	
	public static void main(String[] args) {
		Ex6_Arg_Rtype_Method e=new Ex6_Arg_Rtype_Method();
		int[] a=e.m1();
		for(int aa:a)
		System.out.println(aa);
		
		int[] b= {12,4,65,78};
		e.m2(b);
		
	}
}
