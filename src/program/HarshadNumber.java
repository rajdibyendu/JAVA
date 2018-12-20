package program;

public class HarshadNumber {
	public static void main(String[] args) {
		int n=24, temp=n,sum=0;
		while(n>0) {
			int rem=n%10;
			n=n/10;
			sum=sum+rem;
		}
		if(temp%sum==0)
			System.out.println(temp+" is HARSHAD Number");
		else
			System.out.println(temp+" is not HARSHAD Number");
	}
}

//A positive integer which is divisible by the sum of its digits, called Harshad Number (Niven number).
//The first few are 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20, 21, 24, ... 
