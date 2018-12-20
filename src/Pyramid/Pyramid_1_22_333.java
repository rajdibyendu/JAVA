package Pyramid;

public class Pyramid_1_22_333 {
	public static void main(String[] args) {
		int n=6,st=1,sp=n-1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=sp; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=st; k++) {
				System.out.print(i+" ");
			}
			System.out.println();
			sp--;
			st++;
		}
	}
}
