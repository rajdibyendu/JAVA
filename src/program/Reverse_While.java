package program;

public class Reverse_While {
	public static void main(String[] args) {
		int n=1234,temp=n,rev=0,rem=0;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
	}
}
