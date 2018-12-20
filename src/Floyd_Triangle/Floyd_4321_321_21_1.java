package Floyd_Triangle;

public class Floyd_4321_321_21_1 {
public static void main(String[] args) {
	int n=7;
	for(int i=n; i>=1; i--)
	{
		int num=i;
		for (int j=1; j<=i; j++)
	{
		System.out.print(num);
		num--;
	}
		System.out.println();
	}	
}
}
