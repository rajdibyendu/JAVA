package program;

public class ArmstrongUsingMethod {
	public static void main(String[] args) {
		int n=153, temp=n, count=0, strong=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		
		n=temp;
		while(n>0) {
			int rem=n%10;
			n=n/10;
			strong=strong+power(rem, count);
		}
		
		if(strong==temp)
			System.out.println(temp+" is ARMSTRONG");
		else
			System.out.println(temp+" is not ARMSTRONG");
	}
	
	public static int power(int rem, int count) {
		int res=1;
		for(int i=1; i<=count; i++) {
			res=res*rem;
		}
		return res;
	}
}
