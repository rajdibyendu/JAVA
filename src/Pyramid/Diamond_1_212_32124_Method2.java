package Pyramid;

class Diamond_1_212_32124_Method2 {
	public static void main(String[] args) {

		int n = 4; //mention top half part

		//Upper part
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			int num = i;
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(num);
				if (k < i) { //till the value of i, num is decreasing
					num--;
				} else {
					num++;
				}
			}
			System.out.println("");
		}

		//Lower part
		for (int i = n - 1; i >= 1; i--) {
			for (int j = i; j <= n; j++) {
				System.out.print(" ");
			}
			int num = i;
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print(num);
				if (k < i) {
					num--;
				} else {
					num++;
				}
			}
			System.out.println("");
		}
	}
}