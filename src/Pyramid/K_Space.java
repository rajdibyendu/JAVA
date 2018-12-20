package Pyramid;

public class K_Space {
	public static void main(String[] args) {
		int n=7, st=1, sp=n/2;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=sp; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=st; k++) {
				System.out.print("*");
			}
			if(i<=n/2) {
				st++;
				sp--;
			}
			else {
				st--;
				sp++;
			}
			System.out.println();
		}
	}
}
