package pattern;

public class Inverse_M1 {
	public static void main(String[] args) {
		int n=5,sp=2*n-2;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			for(int k=sp; k>=1; k--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
			sp=sp-2;	//sp-=2;
		}
	}
}
