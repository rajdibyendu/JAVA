package program;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int n=153, temp=n,count=0, rem=0, strong=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		
		n=temp;
		while(n>0) {
			rem=n%10;
			n=n/10;
			int sum=1;
			for(int i=1; i<=count; i++) {
				sum=sum*rem;
			}
			strong=strong+sum;			
		}
		
		if(strong==temp)
			System.out.println(temp+" is ARMSTRONG");
		else
			System.out.println(temp+" is not ARMSTRONG");
	}
}

//A number 'a' is an Armstrong Number (narcissistic number),
//if it is equal to the sum of its own digits raised to the power of the number of digits.
