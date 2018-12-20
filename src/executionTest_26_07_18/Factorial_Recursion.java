package executionTest_26_07_18;

public class Factorial_Recursion {
	public static void main(String[] args) {
		int n=0;
		int f=fact(n);
		System.out.println(f);
	}
	public static int fact(int args) {
		if(args==0)
			return 1;
		else
			return args*fact(args-1);
	}
}
