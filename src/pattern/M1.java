package pattern;

public class M1 {
	public static void main(String[] args) {
		int n=5, sp=0;
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print("*");
			}
			
			for(int k=1; k<=sp; k++) {
				System.out.print(" ");
			}
			for(int j=n; j>=i; j--) {
				System.out.print("*");
			}
			
			sp=sp+2;
			System.out.println();
		}
	}
}
