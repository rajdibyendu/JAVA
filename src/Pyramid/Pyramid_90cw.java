package Pyramid;

public class Pyramid_90cw
{
	public static void main(String[] args)
	{
	int n=13, st=1;;
	for(int i=1; i<=n; i++)
	{
		
		for(int j=1; j<=st; j++)
		{
			System.out.print(st);
			
		}
		System.out.println();
		if(i<=n/2)
		{
			st++;
		}
		else
		{
			st--;
		}
		
	}
	}
}
