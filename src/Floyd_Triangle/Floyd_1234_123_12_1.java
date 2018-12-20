package Floyd_Triangle;

public class Floyd_1234_123_12_1
{
	public static void main(String[] args)
	{
		int n=7;
		for(int i=1; i<=n; i++)
		{
			for (int j=1; i+j<=n+1; j++)
		{
			System.out.print(j);
		}
			System.out.println();
		}	
	}
}
