package Pyramid;

class K_Space2_Method2 {
	public static void main(String[] args) {

		int n = 4;

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			int num = i;
			for (int k = 1; k <= i; k++) {
				System.out.print("*");

			}
			System.out.println("");
		}

		for (int i = n - 1; i >= 1; i--) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			int num = i;
			for (int k = 1; k <= i; k++) {
				System.out.print("*");

			}
			System.out.println("");
		}
	}
}
