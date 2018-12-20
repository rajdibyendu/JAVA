package program;

public class Combination_nCr {
	public static void main(String[] args) {
		int n=5,r=3;
		int nCr=fact(n)/(fact(r)*fact(n-r));
		System.out.println(n+"C"+r+" is equal to "+nCr);
	}
	static int fact(int num) {
		int i=1;
		while(num>0) {
			i=num*i;
			num--;
		}
		return i;
	}
}
