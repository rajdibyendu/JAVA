package Pyramid;

public class L_Stair {
	public static void main(String[] args) {
		int n=6,str=0;
		for(int i=1; i<=n; i++) {
			if(i%2==1)
				str=i+1;
			for(int j=1; j<=str; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}
}
