package Floyd_Triangle;

public class Floyd_1_121_12321 {
	public static void main(String[] args) {
		int n=7,st=1;
		for (int i=1; i<=n; i++)
		{
			int num=1;
			for (int j=1; j<=st; j++)
			{
				System.out.print(num);
				if (j<=st/2)
					num++;
				else
					num--;
			}
			st=st+2;
			System.out.println();
		}
	}
}

/*int n=7;
for (int i=1; i<=n; i++)
{
	for (int j=1; j<=i; j++)
	{
		System.out.print(j);
	}
	for (int j=i-1; j>=1; j--)
	{
		System.out.print(j);
	}
	System.out.println();
}*/
