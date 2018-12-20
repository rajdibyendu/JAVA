package Pyramid;

public class SierpinskiGasketTriangle {
	public static void main(String[] args) {
		int n=5, sp1=n-1, sp2=n-1, st1=1, st2=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=sp1; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=st1; k++) {
				System.out.print("* ");
			}
			sp1--;
			st1++;
			System.out.println();
		}
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=sp2; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=st2; k++) {
				System.out.print("* ");
			}
			for(int j=1; j<=sp2; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=sp2; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=st2; k++) {
				System.out.print("* ");
			}
			sp2--;
			st2++;
			System.out.println();
		}

	}
}
