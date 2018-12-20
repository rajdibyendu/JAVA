package program;

public class Generic_Root {
	public static void main(String[] args) {
		int num=165,count=0;
		if(num<10)
			System.out.println(num);
		else {
			while(num>=10) {
				count=0;
				while(num>0) {
					int rem=num%10;
					num=num/10;
					count=count+rem;
				}
				if (count>=10)
					num=count;
			}
			System.out.println(count);
		}	
	}
}

//Generic root of a number is defined as the sum of digits of a number until we get a single digit.
//For example: Generic root of 456: 4 + 5 + 6 = 15 since 15 is two digit numbers so 1 + 5 = 6
