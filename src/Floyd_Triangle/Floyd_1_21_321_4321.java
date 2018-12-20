package Floyd_Triangle;

public class Floyd_1_21_321_4321 {

	public static void main(String[] args) {
		int n=7;
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
