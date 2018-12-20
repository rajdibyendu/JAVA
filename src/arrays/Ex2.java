package arrays;

class Pen1{}
public class Ex2 {
	public static void main(String[] args) {
		
		//1. default int type
		int[] arr=new int[4];
		for(int a:arr)
			System.out.println(a);
		
		//2. default boolean type
		boolean[] brr=new boolean[5];
		for(boolean b:brr)
			System.out.println(b);
		
		//3. default class type
		Pen1[] prr=new Pen1[6];
		for(Pen1 p:prr)
			System.out.println(p);
	}
}
