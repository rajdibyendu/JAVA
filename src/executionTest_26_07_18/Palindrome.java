package executionTest_26_07_18;

public class Palindrome {
public static void main(String[] args) {
	int num=121, temp=num, rev=0;
	while(num>0)
	{
		int rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	if(temp==rev)
		System.out.println("PALINDROME");
	else
		System.out.println("NOT PALINDROME");
}
}
