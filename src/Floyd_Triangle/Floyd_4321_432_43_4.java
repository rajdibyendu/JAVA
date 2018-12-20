package Floyd_Triangle;

public class Floyd_4321_432_43_4
{
	public static void main(String[] args)
	{
		int n=7;
		for(int i=1; i<=n; i++)
		{
			for (int j=n; j>=i; j--)
		{
			System.out.print(j);
		}
			System.out.println();
		}	
	}
}
