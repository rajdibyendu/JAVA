package program;

public class StrongNumber {
	public static void main(String[] args) {
		int n=145, temp=n, f=0;
		while(n>0) {
			int rem=n%10;
			f=f+fact(rem);
			n=n/10;
		}
		//System.out.println(f);
		if(f==temp)
			System.out.println(temp+" is STRONG Number");
		else
			System.out.println(temp+" is not STRONG Number");
	}
	public static int fact(int args) {
		if(args==0)
			return 1;
		else
			return args*fact(args-1);
	}
}

//If the sum of factorial of the digits in any number is equal the given number
//then the number is called as STRONG number.
