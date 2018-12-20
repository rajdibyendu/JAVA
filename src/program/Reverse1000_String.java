package program;

public class Reverse1000_String {
	public static void main(String[] args) {
		int n=1000;
		String rev="";
		while(n>0) {
			int rem=n%10;
			n=n/10;
			rev(rem);
		}
	}
	static void rev(int rem) {
		int res=0;
		res=res+rem;
		System.out.println(res);
	}
}
