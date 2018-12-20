package program;

public class Perfect_No_1to1000 {
	public static void main(String[] args) {
		int num=1000;
		for (int i=1; i<=num; i++) {
			int sum=0;
			for (int j=1; j<i; j++) {
				if (i%j==0) {
					sum=sum+j;
				}
			}
			if (i==sum)
				System.out.print(sum+" ");
		}
}
}
