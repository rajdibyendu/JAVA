package program;

public class Perfect_No {
	public static void main(String[] args) {
		int num=28, sum=0;
		for (int i=1; i<=num/2; i++) {
			if (num%i==0) {
				sum=sum+i;
			}
		}
		if (num==sum)
			System.out.println(sum+" is PERFECT NUMBER");
		else
			System.out.println(sum+" is NOT PERFECT NUMBER");
}
}

//Perfect number, a positive integer that is equal to the sum of its proper divisors.
//The smallest perfect number is 6, which is the sum of 1, 2, and 3.