package executionTest_26_07_18;

public class Pattern_2 {

	public static void main(String[] args) {
		int n=4, st=1, sp=n-1, num=1;
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=sp; j++)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=st; k++)
			{
				System.out.print(num+" ");
				num++;
			}
			st++;
			sp--;
			System.out.println();
		}
	}

}
